package com.hashcode.datastructure;

import java.util.ArrayList;
import java.util.List;
import com.hashcode.utils.Car;
import com.hashcode.utils.Point;
import com.hashcode.utils.Ride;

public class Simulation {
  List<Car> cars;
  List<Ride> rides;
  int rowNumber;
  int columnNumber;
  int nCars;
  int nRides;
  int bonus;
  int steps;

  public Simulation(List<Ride> rides, int rowNumber, int columnNumber, int nCars, int nRides,
    int bonus, int steps) {
    this.cars = cars;
    this.rides = rides;
    this.rowNumber = rowNumber;
    this.columnNumber = columnNumber;
    this.nCars = nCars;
    this.nRides = nRides;
    this.bonus = bonus;
    this.steps = steps;

    List<Car> cars = new ArrayList<>();

    for (int nCurrentCar = 0; nCurrentCar < nCars; nCurrentCar++) {
      cars.add(new Car(0,0));
    }
  }

  public int getRowNumber() {
    return rowNumber;
  }

  public void setRowNumber(int rowNumber) {
    this.rowNumber = rowNumber;
  }

  public int getColumnNumber() {
    return columnNumber;
  }

  public void setColumnNumber(int columnNumber) {
    this.columnNumber = columnNumber;
  }

  public int getnCars() {
    return nCars;
  }

  public void setnCars(int nCars) {
    this.nCars = nCars;
  }

  public int getnRides() {
    return nRides;
  }

  public void setnRides(int nRides) {
    this.nRides = nRides;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  public int getSteps() {
    return steps;
  }

  public void setSteps(int steps) {
    this.steps = steps;
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
}
