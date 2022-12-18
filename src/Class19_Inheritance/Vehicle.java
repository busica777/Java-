package Class19_Inheritance;

class Vehicle {
    int noOfWheel; //grandfather
    int topSpeed;
    public void printTopSpeed(){
        System.out.println(topSpeed);
    }
}

 class Car extends Vehicle{ //father class
    String model;
    String make;
    int year;
}

class Tesla extends Car{
    void printInfo(){System.out.println("I am a Electrical Car");
    }
}

class Toyota extends Car{
    void printInfo(){
        System.out.println("I am a diesel Engine Car");
    }
}
    /*class CustomCar extends Toyota,Tesla{
    not allowed because of diamond problem
}*/
class Tester{
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.printInfo();
    }
}

