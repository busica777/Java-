package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class HWLoan {

	public static void main(String[] args) {
		// TODO You are a loan specialist and you need to ask user what is the amount of loan is needed. 
		//If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
Scanner scan=new Scanner(System.in);
System.out.println("What's the amount of loan do you need?");
int loan=scan.nextInt();

if(loan<=200000)
{
	System.out.println("loan will be approved");
} else
	
{
	System.out.println("Loan will be rejected");
	
	
}
	}

}