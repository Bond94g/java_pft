package ru.stqa.pft.sandbox;

public class MySecondProgram {
  public static void main(String[] args) {
  Point p1  = new Point(3, 4);
  Point p2 = new Point(5, 6);

    System.out.println("Расстояние между 2 точками :" + p1.distance(p2));
  }
}
