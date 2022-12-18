package Class13_StringMethods;

import java.util.Arrays;

public class Clsss12RecapStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="Today is Sunday";	
		
	String day=str.substring(9);	
		System.out.println(day);
		System.out.println(str.substring(6,8));
		
		System.out.println(str.charAt(4));
		char c=str.charAt(4); //calling the method charAt on str object
		System.out.println();
		
		char[] charArr=str.toCharArray();
		System.out.println(charArr); //prints out a regular text
		System.out.println(Arrays.toString(charArr));// prints out as array
		
		int index=str.indexOf("a");
		System.out.println(str.indexOf("a",6));
	}

}
