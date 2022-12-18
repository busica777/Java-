package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class InpurFromKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * 
		 * /
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your name");
		//take a String type input from the keyboard and stores it in name variable
		
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		//takes an int from the keyboard and stores it in age variable
		
		int age=scanner.nextInt();
		
		String address=scanner.nextLine();
		System.out.println("Please enter you address");
		
		System.out.println("Hi "+name+" your are "+age+ " years old and your address is "+ address);
	}

}
