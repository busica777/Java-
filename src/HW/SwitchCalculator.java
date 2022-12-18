package HW;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Please, enter first number");
int num1=input.nextInt();

System.out.println("Please, enter second number");
int num2=input.nextInt();

System.out.println("Please, enter the desired operator: + OR - OR / OR *");
char op=input.next().charAt(0);
int result=0;

switch (op) {
   case '+':
	   result=num1+num2;
	   break;
	   
   case '-':
	   result=num1-num2;
	   break;
	   
   case '*':
	   result=num1*num2;
	   break;
	   
   case '/':
	   result=num1/num2;
	   break;
} if(op=='+'||op=='-'||op=='/'||op=='*') {
	System.out.println(num1+op+num2+" = "+result);
}else {
	System.out.println("Invalid operator. Please try again");
}
	} }
	
	


