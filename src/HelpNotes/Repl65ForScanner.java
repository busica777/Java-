package HelpNotes;

import java.util.Scanner;

public class Repl65ForScanner {
//Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.

//Sample input/outputs:

//In: 7
//6 5 4 3 2 1 0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    System.out.println("In");
	  int x=input.nextInt();

	    for(int a=x; a>=0;a--){
	      
	    if(a==x){
	      continue;
	    } System.out.print(a+ " ");
	  }}}