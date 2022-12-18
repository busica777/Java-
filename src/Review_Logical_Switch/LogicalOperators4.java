package Review_Logical_Switch;

import java.util.Scanner;

public class LogicalOperators4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter if you are comfortable with" + "java logical operators now");
		boolean goodWithOp=scanner.nextBoolean();
		
		if(!goodWithOp) {
			System.out.println("Do some more research solve some repls and take some rest");
		}
	}

}
