package Class02;

public class ArithemticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// +,-, *,/,%
		
		int a=900;
		int b=100; 
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		int c=10;
		int d=3;
		
		int sum=c+d;
		int sub= c-d;
		int remainder=c%d;  //10%3=1
	    int div=c/d; //10/3=3
	    
		System.out.println("Sum is = "+sum);
		System.out.println("Sub is="+sub);
		System.out.println("Remainder is ="+remainder);
	    System.out.println("Divsion of intergers ="+ div);//3
	    
	    double num1=10.0;
	    double num2=3.0;
	    System.out.println("division of double ="+num1/num2);
	    System.out.println(num1%num2);
	    
		System.out.println("using float data type");
	    float number1=10.0f;
	    float number2=3.0f;
	     System.out.println("division of float="+number1/number2);
	     System.out.println(number1%number2);
	    
	    System.out.println(10+10/10); //11
	     System.out.println((10+10)/10); //2
	     System.out.println("remainder examples");
		//remainder - % - mod operator
		System.out.println(16%13);
		
	}

	
}
