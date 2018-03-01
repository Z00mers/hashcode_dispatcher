package com.hashcode.datastructure;

import java.util.List;
import com.hashcode.utils.Car;
import com.hashcode.utils.Ride;

public class Simulation {
  List<Car> cars;
  List<Ride> rides;
  int rowNumber;
  int columnNumber;
  int nVehicles;
  int nRides;
  int bonus;
  int steps;

  public Simulation(int rowNumber, int columnNumber, int nVehicles, int nRides, int bonus, int steps) {
    this.rowNumber = rowNumber;
    this.columnNumber = columnNumber;
    this.nVehicles = nVehicles;
    this.nRides = nRides;
    this.bonus = bonus;
    this.steps = steps;
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

  public int getnVehicles() {
    return nVehicles;
  }

  public void setnVehicles(int nVehicles) {
    this.nVehicles = nVehicles;
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
}
