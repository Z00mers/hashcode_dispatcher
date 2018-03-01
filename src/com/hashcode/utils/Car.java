package com.hashcode.utils;

public class Car extends Point{

  Ride ride = null;
  int costToGo;

  public Car(int x_point, int y_point) {
    super(x_point, y_point);
  }

  public Ride getRide() {
    return ride;
  }

  public void setRide(Ride ride) {
    this.costToGo = ride.getCost();
    this.ride = ride;
  }

  public boolean isAvailable() {
    return (this.ride == null);
  }

  public int getCostToGo() {
    return costToGo;
  }

  public void removeFromCostOne(){
    costToGo--;
  }
}
