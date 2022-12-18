package Class07_Loop;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	String answer;
	
	do {
	System.out.println("Did you get hired?");
	 answer=sc.next();
		/*
	 * /	
	 */
	}while(!answer.equals("yes"));
System.out.println("Congrats");
}}
