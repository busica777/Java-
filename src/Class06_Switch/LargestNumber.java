package Class06_Switch;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=300;
int n2=100;
int n3=150;
int largest=0;

if (n1>n2 && n1>n3)
{largest=n1;}
else if (n2>n3 && n2>n1)
{largest=n2;}
else if (n3>n1 && n3>n2)
{largest=n3;}
		
System.out.println(largest+" is the largest number");

if(largest!=0)

{if(largest%2==0)
{System.out.println(largest+ " is even number");}

else 
{System.out.println(largest+ " is odd number");}
		
		
		
	}

}}
