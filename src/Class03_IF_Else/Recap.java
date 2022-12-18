package Class03_IF_Else;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String concatenation helps us to combine a String with any primitive data type together 
String firtsName="Mina";
String lastName="Henen";
String fullName=firtsName+ " "+lastName;
System.out.println(fullName);
		
int houseNo=15;
int apartamentNO=5;
String streetName="That street";
String city="New York";
String country="USA";
String fullAdress=houseNo+" "+apartamentNO+" " +streetName+" "+city+" "+country;
System.out.println(fullAdress);

String incompleteAddress=houseNo+city;

String step1=("If we subtract 10 from 5 we'll get ="+10); //result in a String
System.out.println(step1);
// it's not defined java does not understand what to do when we ask her  to subtract
// a String from number it complains
//String step2=step1-5

System.out.println("if we subtract 10 from 5 we'll get= "+(10-5));


	}

}
