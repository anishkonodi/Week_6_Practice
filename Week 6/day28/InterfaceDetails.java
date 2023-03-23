import java.util.Scanner;
interface Operations {
  void add();
  void sub();
  void mul();
  void div();
}
class Calculator implements Operations {
  Scanner s = new Scanner(System.in);

  public void add() {
    System.out.println("Enter two numbers to add ");
    int a = s.nextInt();
    int b = s.nextInt();
    int sum = a + b;
    System.out.println("The sum of two number is " + sum);
  }
  public void mul() {
    System.out.println("Enter two numbers to multiply");
    int a = s.nextInt();
    int b = s.nextInt();
    System.out.println("The multiplication of two number is " + a * b);
  }
  public void sub() {
    System.out.println("Enter two numbers to subtraction ");
    int a = s.nextInt();
    int b = s.nextInt();
    int res = a - b;
    System.out.println("The subtraction of two number is " + res);
  }
  public void div() {
    System.out.println("Enter two numbers to divide ");
    int a = s.nextInt();
    int b = s.nextInt();
    System.out.println("The division of two number is " + a / b);
  }
}
class InterfaceDetails {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Operations obj = new Calculator();
    System.out.println("Enter your choice ");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    int choice = s.nextInt();
    switch (choice) {
      case 1: {
        obj.add();
        break;
      }
      case 2: {
        obj.sub();
        break;
      }
      case 3: {
        obj.mul();
        break;
      }
      case 4: {
        obj.div();
        break;
      }
    }
  }
}