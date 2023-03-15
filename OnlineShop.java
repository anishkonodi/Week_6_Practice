
//Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance.
import java.util.Scanner;

class Product {
  Scanner s = new Scanner(System.in);

  void calculateDiscount() {
    System.out.println("DISCOUNT SALE!!!");
  }
}

class Electronics extends Product {
  void calculateDiscount() {
    System.out.println("Enter total purchase amount");
    double amount = s.nextInt();
    if (amount >= 2000) {
      double discount = 10 * amount / 100;
      amount = amount - discount;
      System.out.println("After discount the total amount is " + amount);
    } else {
      System.out.println("Purchase amount is less than 2000 so there is no discount");
      System.out.println("The total amount is " + amount);
    }
  }
}

class Apparel extends Product {
  void calculateDiscount() {
    System.out.println("Enter total purchase amount");
    double amount = s.nextInt();
    if (amount >= 5000) {
      double discount = 20 * amount / 100;
      amount = amount - discount;
      System.out.println("After discount the total amount is " + amount);
    } else {
      System.out.println("Purchase amount is less than 500 so there is no discount");
      System.out.println("The total amount is " + amount);
    }
  }
}

class OnlineShop{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    
    System.out.println("enter your choice");
    System.out.println("1. Electronics");
    System.out.println("2. Apparels");
    int choice=s.nextInt();
    switch(choice){
      case 1:{
        Electronics obj=new Electronics();
        obj.calculateDiscount();
        System.out.println("Thank you");
        break;
      }
      case 2:{
      Apparel object=new Apparel();
      object.calculateDiscount();
        System.out.println("Thank you");
        break;
      }
    }
  }
}