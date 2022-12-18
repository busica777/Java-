package HW;

import java.util.Scanner;

public class HWSwitchUserGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("What is your grade?");

char grade=input.next().charAt(0);
String explanation;

switch(grade) {

case 'A':
	explanation="Exellent";
	break;
	
case 'B':
	explanation="Good";
	break;
	
case 'C':
	explanation="Average";
	break;
	
case 'D':
	explanation="Bad";
	break;
		
default:
	explanation="Not Acceptable";
	break;
}
	System.out.println("Your grade is "+grade+" and it's "+explanation);
	


	

	}

}
