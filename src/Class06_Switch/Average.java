package Class06_Switch;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("Please enter your quiz score");
double quiz=input.nextDouble();

System.out.println("Please enter your midterm");
double midterm=input.nextDouble();

System.out.println("Please enter your final score");
double myfinal=input.nextDouble();

double average=(quiz+midterm+myfinal)/3;

String avg=null; 
if (average>=90)
{avg="A";}

else if (average>=70 && average<=90)
{avg="B";}

else if (average>=50 && average<70)
{avg="C";}

else if (average<50)
{avg="F";}

System.out.println(avg);

}
}