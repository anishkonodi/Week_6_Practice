import java.util.Scanner;

class Employee {
  String eName;
  String eId;
  String salary;

  void setEname(String eName) {
    this.eName = eName;
  }

  void setEid(String eId) {
    this.eId = eId;
  }

  void setSalary(String salary) {
    this.salary = salary;
  }

  String getEname() {
    return eName;
  }

  String getEid() {
    return eId;
  }

  String getSalary() {
    return salary;
  }
}

class EmployeeDetail {
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Employee obj=new Employee();
    Employee workers[]=new Employee[5];
    System.out.println("enter the details of the employee");
    for(int i=0;i<5;i++){
      System.out.println("enter name of employee "+(i+1));
      String eName=s.next();
      if(eName.length()>=5){
        workers[i].setEname(eName);
      }
      else{
        System.out.println("name should contains 5 minimum character");
      }
      System.out.println("enter ID of employee "+(i+1));
      String eId=s.nextLine();
      if(eId.length()==7){
         workers[i].setEid(eId);
      }
     else{
       System.out.println("Id length should be 7 digits");
     }
      System.out.println("Enter the salary of the employee "+(i+1));
      String salary=s.nextLine();
      if(salary.length()>=5&&salary.length()<=10){
        workers[i].setSalary(salary);
      }
      else{
        System.out.println("salary should be 5 to 10 digits");
      }
      
    }
    
    for(int i=0;i<5;i++){
      System.out.println(workers[i].getEname()+"   "+workers[i].getEid()+"  "+workers[i].getSalary());
    }
    
  }
}