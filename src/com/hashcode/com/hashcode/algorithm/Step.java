package com.hashcode.com.hashcode.algorithm;

import com.hashcode.utils.Car;
import com.hashcode.utils.Ride;

import java.util.List;

public class Step {

  static int occuranceStep = 0;
  List<Car> cars;
  List<Ride> rides;

  public Step(List<Car> cars, List<Ride> rides) {
    this.cars = cars;
    this.rides = rides;
  }

}
