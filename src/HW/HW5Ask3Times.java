package HW;

import java.util.Scanner;

public class HW5Ask3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...
		
Scanner input=new Scanner(System.in);
for (int a=1; a<=3; a++) {
	System.out.println("Please enter your name");
	String name= input.nextLine();
	System.out.println("Good Afternoon "+ name);
}

	}

}
