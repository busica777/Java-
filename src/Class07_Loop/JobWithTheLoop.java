package Class07_Loop;

import java.util.Scanner;

public class JobWithTheLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String answer;
		
		System.out.println("Did you get hired?");
		 answer=sc.nextLine();
		 
		 while(!answer.equals("yes")) {
			// System.out.println("Did you get hired?");   KEEP LOOPING
			 
		 } System.out.println("Congrats");
	}

}
