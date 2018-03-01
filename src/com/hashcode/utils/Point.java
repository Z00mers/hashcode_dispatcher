package com.hashcode.utils;

import static java.lang.Math.abs;

public class Point {

  int x, y;

  public Point(int x_point, int y_point){
    x = x_point;
    y = y_point;
  }

  static int distance(Point a, Point b){
    return abs(a.getX() - b.getX()) + abs(a.getY() - b.getY());
  }


  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}
