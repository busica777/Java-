package Class11_OOP;

public class OOPDog {

	//State
	//attributes/properties/fields
	
String name;
String color;
String breed;
double weight;
int age;

//these are the behaviors of dog
void bark() {
	System.out.println("Barking....");
}
void sleep() {
	System.out.println("Dog is sleepeng....");
}

public static void main(String[]aaaa) {
	//creating objects from a class
	//new Dog();=>creates an object of class Dog
	
OOPDog dog1=new OOPDog();

//calling a behavior on an object
dog1.bark();
dog1.sleep();	
}




}
