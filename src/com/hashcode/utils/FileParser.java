package com.google.hashcode.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.hashcode.datastructure.Simulation;
import com.hashcode.utils.Car;
import com.hashcode.utils.Point;
import com.hashcode.utils.Ride;

public class FileParser {

  private String filename;

  public FileParser(String fileToOpen){

    filename = fileToOpen;

  }

  public List<String> parseRowsFromFile(){

    List<String> rows = new ArrayList<>();

    try
    {
      BufferedReader fileReader = new BufferedReader(new FileReader(filename));
      String line;
      while ((line = fileReader.readLine()) != null)
      {
        rows.add(line);
      }
      fileReader.close();
      return rows;
    }
    catch (Exception e)
    {
      System.err.format("Exception occurred trying to read '%s'.", filename);
      e.printStackTrace();
      return null;
    }

  }

  public Simulation parseFile(){

    List<String> rows = parseRowsFromFile();
    List<Car> cars = new ArrayList<>();
    List<Ride> rides = new ArrayList<>();
    int currentRow = 0;
    int nRows = rows.size() - 1;          // One is the header

    // ToDo add the row number check (row number cant be < 2)

    String header = rows.get(0);

    String[] params = header.split("\\s+");
    int rowNumber = Integer.parseInt(params[0]);
    int columnNumber = Integer.parseInt(params[1]);
    int nVehicles = Integer.parseInt(params[2]);
    int nRides = Integer.parseInt(params[3]);
    int bonus = Integer.parseInt(params[4]);
    int steps = Integer.parseInt(params[5]);

    String rideParameters[];
    for (currentRow = 0; currentRow < nRows; currentRow++) {
      rideParameters = rows.get(currentRow).split("\\s+");

      Ride currentRide =
        new Ride(
          new Point(Integer.parseInt(rideParameters[0]), Integer.parseInt(rideParameters[1])),
          new Point(Integer.parseInt(rideParameters[2]), Integer.parseInt(rideParameters[3])),
          Integer.parseInt(rideParameters[4]),
          Integer.parseInt(rideParameters[5]),
          bonus);

      rides.add(currentRide);
    }

    Simulation simulation = new Simulation(rowNumber, columnNumber, nVehicles, nRides, bonus, steps);

    return 0;

  }



}
