package com.hashcode.utils;

public class Car extends Point{

  Ride ride = null;

  public Car(int x_point, int y_point) {
    super(x_point, y_point);
  }

  public Ride getRide() {
    return ride;
  }

  public void setRide(Ride ride) {
    this.ride = ride;
  }

  public boolean isAvailable() {
    return (this.ride == null);
  }
}
