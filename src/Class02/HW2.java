package Class02;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The __ of 2 numbers __ and  is equal to __”
		double a=8.13;
		double b=4.52;
		double sum=a+b;
		double sub=a-b;
		double sub1=b-a;
		double mult=a*b;
		double div=a/b;
		double div1=b/a;
		
		System.out.println("The sum of 2 numbers " +a+ " and "+ b+  " is equal to "+ sum);
		System.out.println("The subtract of 2 numbers " +a + " and "+ b+  " is equal to " +sub);
		System.out.println("The subtract of 2 numbers " +b +" and " +a+ " is equal to " +sub1 );
		System.out.println("The multiply of 2 numbers "+ a+ " and "  +b + " is equal to " +mult);
		System.out.println("The divide of 2 numbers "+a+ " and "+ b+ " is equal to " + div);
		System.out.println("The divide of 2 numbers " +b+" and " +a+ " is equal to " +div1);
		
		//the square of 3.9
		double num=3.9;
		double square=num*num;
		 System.out.println("The square of " + num + " is "+ square);
		 
		 //perimeter 
		 
		 int width=5;
		 int height=8;
		 System.out.println("The perimeter of rectangle with width "+width+ " and height "+ height + " is equal to " + (width+height)*2 + " and the area is " + width*height  );
		
		
		
	}

}
