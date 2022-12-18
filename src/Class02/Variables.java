package Class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="John";
String lname="Naan";
String type= "B";
String city="Miami";
String state= "FL";
String phnumber="8884443344";
System.out.println("My name is "+ name+ " and my last name is "+ lname);
System.out.println("I am "+ type+ " student");
System.out.println("I live in "+ city+ " and state "+ state);
System.out.println("And my phone number is "+ phnumber);



//Changes
name="Sam"; //Reassigning
city="Boston ";
state="MA";
phnumber="7774446633";

System.out.println("My name is " + name + " and I moved to " + city + state);
System.out.println("My new phone number is "+ phnumber);

//Rules for Identifiers-names(variables
//1. canntot use keywords as identifiers
//String new ="hello; -> error
//String new ="Hello";	

//2 cannot have spaces in identifiers 
//String last name="Smith";	

//3.identifiers cannot start with numbers
//int 1number=123;
int number1=123; // number can be anywhere after

/* 4.identifiers cannot contain any special characters 
 * boolean hello!=true;
 * char #chara-'A';
 * except $ OR _
 */
	double $price=9.98;
	float _price1_=1.99F;
	
	
	/*
	 * Naming Conventions
	 *Class should start with upper case and follow camel
	 *Variables should start with lowercase and follow
	 */
	 String Weather="hot"; //not preferred
	 String myWeather="cold";// preferred
	 
	 
	}

}
