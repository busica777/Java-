package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class INputFromKeybord2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner  scanner=new Scanner(System.in);

System.out.println("Please enter your age");
int age=scanner.nextInt(); //we use next int type of data from the keyboard

if(age<18) {
	System.out.println("You should study");
} else {
	System.out.println("You should start working");
}






	}

}
