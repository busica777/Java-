package HW;

import java.util.Scanner;

public class IfCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Please, enter first number");		
int num1=input.nextInt();

System.out.println("Please, enter second number");
int num2=input.nextInt();

System.out.println("Please, enter an arithmetic operator");
char op=input.next().charAt(0);
int result=0;

if(op=='+') {
	System.out.println(num1+num2);
}else if (op=='-') {
	System.out.println(num1-num2);
} else if (op=='*') {
	System.out.println(num1*num2);
} else if (op=='/') {
	System.out.println(num1/num2);
}else {
	System.out.println("Invalid");
}
	

	}

}
