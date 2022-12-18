package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class HWGPA {

	public static void main(String[] args) {
		// TODO Write a program to store a boolean value of whether user has diploma or not. 
		//If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
		//Then if user has a degree program should check a gpa score. 
		//If gpa score is higher or equals to 3.5 → output should say 
		//“You are eligible for scholarship”, otherwise → “You should have studied harder” .
Scanner scan=new Scanner(System.in);

System.out.println("Do you have a diploma? Please enter true or false");

boolean diploma=scan.nextBoolean();

if(diploma){
	
    System.out.println("Congratulations");
	System.out.println("What is your GPA?");
	
	double gpa=scan.nextDouble();
	if(gpa>=3.5) {
		System.out.println("You are eligible for scholarship");
		
	} else {
		System.out.println("You should have studied harder");
		
	}
	} else {
		System.out.println("You shold get a degree");
	
	
	

}}}
