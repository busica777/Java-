package Class06_Switch;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the current time use 24 h  format");
        int hour=scan.nextInt();
String timeOfTheDay;

        if(hour>=1 && hour<=11) {
        	timeOfTheDay="Moning";
        	
        }else  if(hour>=12 && hour<=15) {
        	timeOfTheDay="Afternoon";
        	
        }else  if(hour>=16 && hour<=20) {
        	timeOfTheDay="Evening";
        	
        }else  if(hour>=21 && hour<=24) {
        	timeOfTheDay="Night";
        	}
        else {System.out.println("Wrong number is entered");
        timeOfTheDay="Invalid";}
        
System.out.println(timeOfTheDay);
}}
