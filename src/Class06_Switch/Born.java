package Class06_Switch;

import java.util.Scanner;

public class Born {

	public static void main(String[] args) {
	    Scanner box=new Scanner(System.in);
	    System.out.println("Please enter your birth month");
	    String month=box.nextLine();
	    
String season=null;
	    if(month.equals("March") ||month.equals("April") || month.equals("May")){
	    	season="Spring";
	    } 
	    else  if (month.equals("June")|| month.equals("July") || month.equals("August")){
	    	season="Summer";
	    }
	    else if(month.equals("September")|| month.equals("October")||  month.equals("November")) {
	    	season="Fall";}
	    
	     else if(month.equals("December")|| month.equals("January")||  month.equals("February")){
	    	 season="Winter";}
	 else {
	    System.out.println("Invalid  month");//optional
	}
	     System.out.println(season);
	
	}}