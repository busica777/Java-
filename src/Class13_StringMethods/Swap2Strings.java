package Class13_StringMethods;

public class Swap2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Declare two strings
        String a = "Yo Yo Yo";
        String b = "What's good?";
         
        // Print String before swapping
        System.out.println("Strings before swap: a = " +
                                       a + " and b = "+b);
         
        // append 2nd string to 1st
        a = a + b;
         
        // store initial string a in string b
        b = a.substring(0,a.length()-b.length());
         
        // store initial string b in string a
        a = a.substring(b.length());
         
        // print String after swapping
        System.out.println("Strings after swap: a = " +
                                     a + " and b = " + b);       
    }   
}