
//Create an interface Employee with the following methods:public void calculateSalary();
//public void displayEmployeeDetails();
//Create classes Manager, Developer, and Tester that implement this interface. Write a program that accepts the type of employee and their details (name, age, designation, salary) and calculates their salary based on their designation. Display the employee details and the calculated salary. 
import java.util.Scanner;

interface Employee {
  void calculateSalary();
  void displayEmployeeDetails();
}

class Manager implements Employee{
  public String name;
  public int age;
  public String designation;
  public double salary;

  Manager(String name,int age,String designation,double salary){
    this.name=name;
    this.age=age;
    this.designation=designation;
    this.salary=salary;
  }
  public void calculateSalary(){
    double hra=salary*10/100;
    double da=salary*15/100;
    salary=hra+da+salary;
    displayEmployeeDetails();
  }
  public void displayEmployeeDetails(){
    System.out.println("The name of the employee is "+name);
    System.out.println("The age of the employee is "+age);
    System.out.println("The designation of the employee is "+designation);
    System.out.println("The salary of the employee is "+salary);
  }
  
}

class Developer implements Employee{
  public String name;
  public int age;
  public String designation;
  public double salary;

  Developer(String name,int age,String designation,double salary){
    this.name=name;
    this.age=age;
    this.designation=designation;
    this.salary=salary;
  }
  public void calculateSalary(){
    double hra=salary*12/100;
    double da=salary*33/100;
    salary=hra+da+salary;
    displayEmployeeDetails();
  }
  public void displayEmployeeDetails(){
    System.out.println("The name of the employee is "+name);
    System.out.println("The age of the employee is "+age);
    System.out.println("The designation of the employee is "+designation);
    System.out.println("The salary of the employee is "+salary);
  }
  
}

class Tester implements Employee{
  public String name;
  public int age;
  public String designation;
  public double salary;

  Tester(String name,int age,String designation,double salary){
    this.name=name;
    this.age=age;
    this.designation=designation;
    this.salary=salary;
  }
  public void calculateSalary(){
    double hra=salary*5/100;
    double da=salary*20/100;
    salary=hra+da+salary;
    displayEmployeeDetails();
  }
  public void displayEmployeeDetails(){
    System.out.println("The name of the employee is "+name);
    System.out.println("The age of the employee is "+age);
    System.out.println("The designation of the employee is "+designation);
    System.out.println("The salary of the employee is "+salary);
  }
  
}

class EmployeeDetails{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the designation");
    String role=s.next();
   
    if(role.equals("manager")){
       Employee obj=new Manager("Anish",22,role,50000);
       obj.calculateSalary();
    }
    // else if(role.equals("developer")){
    //   Employee dev=new Developer();
    //   dev.calculateSalary();
    // }
    // else if(role.equals("tester")){
    //   Employee test=new Tester();
    //   test.calculateSalary();
    // }
    // else{
    //   System.out.println("enter proper role");
    // }
  }
}