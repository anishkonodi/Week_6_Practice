import java.util.Scanner;
class Student{
  public void read(){
    System.out.println("the name of the book is atomic habbits");
  }
  public void read(String name){
    System.out.println("the name of the book is= "+name);
  }
  public void read(int no_of_copies){
    System.out.println("the copies are"+no_of_copies);
  }
  public void read(int scores,double percent){
    System.out.println("The score is "+scores+" percent is "+percent);
  }
}
class PolymorphismDemo{
  Scanner s=new Scanner(System.in);
  public static void main(String args[]){
    Student student=new Student();
    student.read();
    student.read("atomichabbits");
    student.read(10);
    student.read(88,89.98);
  }
}