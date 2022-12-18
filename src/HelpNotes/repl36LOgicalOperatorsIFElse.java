package HelpNotes;

import java.util.Scanner;

public class repl36LOgicalOperatorsIFElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		  System.out.println("Please enter first word");
		String word1=scan.nextLine();

		  System.out.println("Please enter 2nd word");
		String word2=scan.nextLine();

		  System.out.println("Please enter 1st number");
		int num1=scan.nextInt();

		  System.out.println("Please enter 2nd number");
		int num2=scan.nextInt();

		if (num1==num2 && word1.equals(word2))
		{System.out.println("AND");}
		  
		 else if (num1==num2 || word1.equals(word2))
		 {System.out.println("OR");}

		else if (num1!=num2 && !word1.equals(word2))
		  {System.out.println("NONE");}	
	}

}
