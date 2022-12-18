package Class04_IF_NestedIF_Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {
	/* if we need one outcome based on if conditions we use
	*if ifthe outcomes are two we usr if else if outcomes are more than
	*that we can use if  else if
	* whenever you have to check more than two conditions always use if conditions
	*
	*/
		int number =12;

        if (number > 0) {
            System.out.println("number is positive");
        }
        if (number < 0) {
            System.out.println("number is negative");

        }
        if (number == 0) {
            System.out.println("number is 0");

        }

// *******************************************Second Program**************************************************
        if (number > 0) 
        {
            System.out.println("number is positive");
        } 
        else if (number < 0) 
        {
            System.out.println("number is negative");

        }
        else  {
            System.out.println("number is 0");
        }}}