package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class HWBank {

	public static void main(String[] args) {
		// TODO Create a Java program and store values of mortgage rate and mortgage price. 
		//First, program should check if rate is higher than 4.5 user will not buy a house, otherwise user will consider buying. 
		//Once user decides to buy a house, if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash
Scanner scan=new Scanner(System.in);
System.out.println("What's the Mortgage rate?");	
double rate=scan.nextDouble();

if(rate<4.5) {
	System.out.println("Will consider buying a house");
}
System.out.println("What's the price?");		
		
int price=scan.nextInt();
	if(price>200000)
	{
		System.out.println("Will take a loan");
	}else {
		System.out.println("Will pay cash");
	}
	}

}
