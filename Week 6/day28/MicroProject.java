//Restaurant: Create a class called "Dish" that represents a dish. The class should have properties such as name, ingredients, and price, and methods such as getName, getIngredients, and getPrice. Create another class called "Restaurant" that represents a restaurant. The class should have a list of dishes, and methods such as addDish, removeDish, and getTotalCost

import java.util.Scanner;

class Dish {
  String name;
  String ingredients;
  int price;

  void setName(String name) {
    this.name = name;
  }

  void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  void setPrice(int price) {
    this.price = price;
  }

  String getName() {
    return this.name;
  }

  String getIngredient() {
    return this.ingredients;
  }

  int getPrice() {
    return this.price;
  }
}

class Restaurant extends Dish {
  Scanner s = new Scanner(System.in);
  int numDish = 0;
  Dish dish[] = new Dish[10];
  Dish dis = new Dish();

  void addDish() {
    System.out.println("enter dish name");
    dis.setName(s.nextLine());
    System.out.println("enter the ingredients required");
    dis.setIngredients(s.nextLine());
    System.out.println("enter dish price");
    dis.setPrice(s.nextInt());
    dish[numDish] = dis;
    numDish++;
    System.out.println("New dish added successfully");
  }

  // void removeDish(){
  // System.out.println("enter the dish name to remove");
  // String dishName=s.next();
  // for(int j=0;j<dish.length;j++){
  // Dish dis= (Dish) dish[i];
  // dish[j]=
  // }
  // }

  // void getTotalcost(){

  // }
}

class MicroProject {
  public static void main(String args[]) {
    Restaurant rest = new Restaurant();
    rest.addDish();
    System.out.println("name of the dish is " + rest.getName());
  }
}