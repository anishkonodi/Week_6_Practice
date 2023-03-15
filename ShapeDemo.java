//create a class named "Shape" with three methods named "area", In first method find the area of the rectangle, second method find the area of the circle and third method find the area of the square.

class Shape {
  static double pi = 3.142;

  void area(double length, double width) {

    System.out.println("The area of the rectangle is " + length * width);
  }

  void area(int a) {
    System.out.println("The area of the square is " + a * a);

  }

  void area(double r) {
    double res = pi * r * r;
    System.out.println("The area of the circle is " + res);
  }
}

class ShapeDemo {
  public static void main(String args[]) {
    Shape obj = new Shape();
    obj.area(3.5, 4.5);
    obj.area(5);
    obj.area(5.4);
  }
}