package com.hashcode.utils;

public class Ride {

  private Point startPoint, endPoint;
  private int cost, value, profit = 0;
  private int startAfterStep, completeBeforeStep, bonus;
  private boolean available = true;

  public Ride(Point startPoint, Point endPoint, int startAfterStep, int completeBeforeStep, int bonus) {

    this.startPoint = startPoint;
    this.endPoint = endPoint;
    this.startAfterStep = startAfterStep;
    this.completeBeforeStep = completeBeforeStep;
    this.bonus = bonus;

  }

  public int getProfit(Car car, int currentStep){
    if (this.isAvailable()) {
      cost = Math.max(startAfterStep - currentStep, Point.distance(car, startPoint));
      value = (cost > (this.completeBeforeStep - currentStep)) ?
        Integer.MIN_VALUE :
        Point.distance(endPoint, startPoint) + (isBonusAchievable(car, currentStep) ? bonus : 0);
      profit = value - cost;
    }
    return profit;
  }

  public int getProfit(){
    return profit;
  }

  public int getValue(){
    return value;
  }

  public boolean isBonusAchievable(Point car, int currentStep){

    return (startAfterStep-currentStep - (Point.distance(car, startPoint))) >= 0;
  }

  public int getCost() {
    return cost;
  }

  public void executeIt() {
    this.available = false;
  }

  public boolean isAvailable() {
    return this.available;
  }
}
