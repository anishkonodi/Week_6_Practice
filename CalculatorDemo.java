//Create a class named "Calculator" with three methods named "add" with first method takes two parameters of int type. Second add method takes 2 paramters of double type and third add method takes 3 parameters of first two parameters of int and third parameters of long and perform addition operation in each method.

class Calculator {
  void add(int a, int b) {
    int res=a+b;
    System.out.println("The sum of two integers is " +res);
  }

  void add(double a, double b) {
    double res=a+b;
    System.out.println("The sum of two double values is " +res);
  }

  void add(int a, int b, long c) {
    long res=a+b+c;
    System.out.println("The sum of two integers and one long value  is " +res);
  }
}

class CalculatorDemo{
  public static void main(String args[]){
    Calculator obj=new Calculator();
    obj.add(15,30);
    obj.add(45.56,66.55);
    obj.add(45,67,12345677);
  }
}