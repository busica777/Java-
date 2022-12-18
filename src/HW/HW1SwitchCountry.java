package HW;
import java.util.Scanner;

public class HW1SwitchCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("What country are you from?");

String country=input.nextLine();
String language;

switch(country) {

case "Vietnam":
	language="Vientamese";
	break;

case "Japan":
	language="Japanese";
	break;
	
case "China":
	language="Chinese";
		break;
		
case "Moldova":
	language="Romanian";
    break;
    
case "South Korea":
	language="Korean";
	break;
	
default:
	language="Unknown";
	break;
}
	System.out.println("You speak "+language);


	}

}
