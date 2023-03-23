//Write an abstract class "Shape" which has a method "calculateArea()" which returns the area of the shape. Write two subclasses "Circle" and "Rectangle" which implement the method "calculateArea()" for their respective shapes.

abstract class Shape{
  abstract double calculateArea();
}
class Circle extends Shape{
  double calculateArea(){
    int r=3;
    double area=3.142*r*r;
    return area;
  }
}

class Rectangle extends Shape{
  double calculateArea(){
    int l=10,b=20;
       double area=l*b;
      return area;
    
  }
}
class AreaCalculator{
  public static void main(String args[]){
    Shape C=new Circle();
    Shape R=new Rectangle();
    System.out.println("The area of the circle is "+C.calculateArea());
    System.out.println("The area of the Rectangle is "+R.calculateArea());
  }
}