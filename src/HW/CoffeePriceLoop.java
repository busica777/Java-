package HW;

import java.util.Scanner;

public class CoffeePriceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6. Declare a variable to store a price for a coffee. 
//Ask the user to pay for a coffee. Keep asking to pay for coffee until the user enters the EXACT amount . 
//If the user gives more than coffee price --> ask them to give less, if the user gives less money then ask to give more.
//Once user give EXACT amount print “Please enjoy your coffee
Scanner input=new Scanner(System.in);
int price = 15;
int yourPrice = 0;

for (int i = yourPrice; i <= price ; i++) {
	
	System.out.println("Please pay $15 for coffee.");
	yourPrice = input.nextInt();
	
	if(i < price) {
		System.out.println("Please give less amount.");
		yourPrice = input.nextInt();
		
	} 
	
	for (int e = yourPrice; e <= price ; e++) {
		
		System.out.println("Please pay $15 for coffee.");
		yourPrice = input.nextInt();
		
		if(e > price) {
			System.out.println("Please give more");
			yourPrice = input.nextInt();
			
		} 
		
	
		for (int d = yourPrice; d <= price ; d++) {
			
			System.out.println("Please pay $15 for coffee.");
			yourPrice = input.nextInt();
			
			if(d == price) {
				System.out.println("Please enjoy your coffee");
				yourPrice = input.nextInt();
				
			} 
			
		}
	
	}

}	
	
		
	
	
	



	}

}
