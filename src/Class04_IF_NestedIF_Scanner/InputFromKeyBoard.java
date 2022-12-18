package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		/*
		 * Scanner is the class that helps us to input from keyboard
		 * it contains many different smaller modules called method that can help
		 * us take Strings booleans basically all types of data from the keyboard
		 * / 
		 */
Scanner input= new Scanner(System.in);
// A message will be displayed to the user in the console to enter his/her name
System.out.println("Please enter your name");
//Activates the JAVA program to take the input from the keyboard and store
//it inside the same variable
String name=input.next();
//prints whatever name user enters on the keyboard on the console

System.out.println("Hello "+ name+ " don't be confused");
	}

}
