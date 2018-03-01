package com.hashcode.utils;

public class Ride {

  Point startPoint, endPoint;

  int startAfterStep, completeBeforeStep, bonus;

  public Ride(Point startPoint, Point endPoint, int startAfterStep, int completeBeforeStep, int bonus) {

    this.startPoint = startPoint;
    this.endPoint = endPoint;
    this.startAfterStep = startAfterStep;
    this.completeBeforeStep = completeBeforeStep;
    this.bonus = bonus;

  }

  int value(Point car, int currentStep){

    return Point.distance(endPoint, startPoint) - Math.max(startAfterStep - currentStep, Point.distance(car, startPoint)) + (isBonusAchievable(car, currentStep) ? bonus : 0);

  }

  boolean isBonusAchievable(Point car, int currentStep){

    return (startAfterStep-currentStep - (Point.distance(car, startPoint))) >= 0;
  }

}
