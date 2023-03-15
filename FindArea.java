//Write a program that demonstrates method overriding. Define a superclass called Shape with a method called getArea() that returns 0. Define two subclasses, Circle and Rectangle, that extend Shape and override the getArea() method to calculate and return the area of their respective shapes. In the main method, create instances of both Circle and Rectangle and call their getArea() methods. 

import java.util.Scanner;

class Shape {
  Scanner s = new Scanner(System.in);

  double getArea() {
    return 0;
  }
}

class Circle extends Shape {
  Scanner s = new Scanner(System.in);

  double getArea() {
    System.out.println("Enter the radius of the circle to get area");
    double radius = s.nextDouble();
    double area = 3.142 * radius * radius;
    return area;
  }
}

class Rectangle extends Shape {
  double getArea() {
    System.out.println("Enter the length of the rectangle to get area");
    double length = s.nextDouble();
    System.out.println("Enter the width of the rectangle to get area");
    double width = s.nextDouble();
    double area = length * width;
    return area;
  }
}

class FindArea {
  public static void main(String args[]) {
    Circle obj = new Circle();
    System.out.println("Area of the cicle is " + obj.getArea());
    Rectangle rect = new Rectangle();
    System.out.println("Area of the cicle is " + rect.getArea());
  }
}