package Class18_Constructor;

public class Car {
//common class has a lot of different names such as parent class, super class, base class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    //if a field or method has private access modifier in parent class child classes can't use
    private String engineType;
}
class BMW extends Car{
   double engineCC;
   void printCarDetails(){
       System.out.println("Model "+model+" Make "+make+" Color "+color);

   }
}

class Tesla extends  Car{
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);

    }


}
class Toyota extends  Car{
    double engineCC;
    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);

    }

}
  class CarTester{
      public static void main(String[] args) {
          BMW bmw=new BMW();
          bmw.make="BMW";
          bmw.color="Black";
          bmw.model="x8";
          bmw.engineCC=500;
          bmw.printCarDetails();
      }

  }