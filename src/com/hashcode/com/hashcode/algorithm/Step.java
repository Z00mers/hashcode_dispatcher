package com.hashcode.com.hashcode.algorithm;

import com.hashcode.utils.Car;
import com.hashcode.utils.Ride;

import java.util.List;

public class Step {

  static int currStep = 0;
  static Long points = 0L;
  List<Car> cars;
  List<Ride> rides;

  public Step(List<Car> cars, List<Ride> rides) {
    this.cars = cars;
    this.rides = rides;
  }

  public static int getCurrStep() {
    return currStep;
  }

  public static void setCurrStep(int currStep) {
    Step.currStep = currStep;
  }

  public List<Car> getCars() {
    return cars;
  }

  public void setCars(List<Car> cars) {
    this.cars = cars;
  }

  public List<Ride> getRides() {
    return rides;
  }

  public void setRides(List<Ride> rides) {
    this.rides = rides;
  }

  public void nextStep(){

    for(Car currCar:cars){
      if( currCar.isAvailable() ){
        allocateRide(currCar);
      }else{
        executeRide(currCar);
      }
    }
    currStep++;
  }

  // B_P = (T_ES - T_CURRENT) - DISTANCE_TO_PICKUP
  // if B_P >= 0 bonus is possible
  //
  // S_P = B_P + (T_LF - RIDE_DURATION)
  // if S_P >= 0 score is possible
  //
  // SCORE = [RIDE_DURATION [+ BONUS]]
  // Score is awarded if destination is reached before T_LF
  // Bonus is awarded if pickup is at T_ES
  //
  // Highest priority:
  // 1. S_P = 0
  // 2. B_P = 0
  // 3. SCORE1 > SCORE2
  //
  private void executeRide(Car currCar) {
    currCar.removeFromCostOne();
    if(currCar.getCostToGo()==0){
      points = points + currCar.getRide().getValue();
      currCar.setRide(null);
    }
  }

  private void allocateRide(Car currCar) {
    int maxValue = Integer.MIN_VALUE;
    Ride ride = null;
    for(Ride currRide:rides){
      if (ride.isAvailable()) {
        int currentValue = currRide.getProfit(currCar, currStep);
        ride = currentValue > maxValue ? currRide : ride;
      }
    }
    ride.executeIt();
    currCar.setRide(ride);
  }
}
