package Review_Logical_Switch;

import java.util.Scanner;

public class YesNoExampleLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Are you from batch 14?");
		
		String batch14=scanner.next();
		if(batch14.equalsIgnoreCase("yes")) {
			System.out.println("You are amazing");
		}
		else {
			System.out.println("You are good");
		}
	}

}
