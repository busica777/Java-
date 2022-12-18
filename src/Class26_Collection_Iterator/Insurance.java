package Class26_Collection_Iterator;

import java.util.ArrayList;

//Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
public abstract class Insurance {
    String insuranceName;
 Insurance(String insuranceName){
     this.insuranceName=insuranceName;
 }
   abstract void getQuote() ;


    abstract void cancelInsurance();

}

 class Car extends Insurance{
    String carModel;
    Car(String insuranceName,String carModel){
        super(insuranceName);
        this.carModel=carModel;
    }

 void getQuote() {
     System.out.println("Get a quote "+insuranceName+" for "+carModel);
 }
     void cancelInsurance(){
         System.out.println("Cancel insurance for "+carModel);
     }

 }

 class Pet extends Insurance{
    String petType;
    Pet( String insuranceName,String petType){
        super(insuranceName);
        this.petType=petType;
    }
void getQuote(){
    System.out.println("Get a quote "+insuranceName+" for "+petType);
}
void cancelInsurance(){
    System.out.println("Cancel insurance for "+petType);
}
}
 class Health extends Insurance{
    Health(String insuranceName){
        super(insuranceName);
    }
   void getQuote(){
       System.out.println("Get a quote "+insuranceName+" for health");
   }
   void cancelInsurance(){
       System.out.println("Cancel health insurance");
   }

}
 class Test{
    public static void main(String[] args) {

        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("State Farm","Genesis"));
        insurances.add(new Pet("Progressive","Bird"));
        insurances.add(new Health("Metlife"));

        for (Insurance insurance:insurances
        ) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}