package Class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1ST way to create a variable
	byte b=10;	//create a variable and assign value
		
	//2ND way to create a variable	
	int i; // create a variable. it happens only once
	i=100; //assign value
	//we need to create variable only once
	//then we can use many time we want/need during
	
	//3RD way to create a variable = declare a variable

	int num1,num2,num3;
	num1=100;   //assign value OR initialize variable
	num2=200;   //assign the value
	num3=300;
	
	//int num1=100; error -> duplicate variable
	
	//can  I change a value of variable???
	System.out.println(num2); //200
	
;	num2=2000;  //reassign the value
	
	System.out.println(num2);   //2000
	
	// 1 variable can hold only 1 value at 1 time/per line
	
	
	}

}
