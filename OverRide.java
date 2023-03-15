class Bank{
  void rateOfInterest(){
    System.out.println("Normally average bank rate of interest is 5 Rs");
  }
  
}

class SbiBank extends Bank{
  void rateOfInterest(){
    System.out.println("In SBI rate of interest is 10 Rs");
  }
}

class UnionBank extends Bank{
   void rateOfInterest(){
     super.rateOfInterest();
    System.out.println("In Union bank rate of interest is 15 Rs");
  }
}

class OverRide{
  public static void main(String args[]){
    SbiBank sbi=new SbiBank();
    UnionBank union=new UnionBank();
    union.rateOfInterest();
    sbi.rateOfInterest();
  }
}