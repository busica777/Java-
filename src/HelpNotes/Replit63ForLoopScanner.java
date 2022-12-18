package HelpNotes;

import java.util.Scanner;

public class Replit63ForLoopScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in); // Scanner object 
		System.out.println("Enter the number: "); 
		int n = sc.nextInt(); // receiving input 
		int t; 
		for(int i = 1; i <= 10; i++) { 
			t = n * i; 
			System.out.println(n + "*" + i + "=" + t); 
		} 
	} 
} 