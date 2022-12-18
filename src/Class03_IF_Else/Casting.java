package Class03_IF_Else;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *type casting=>  type data casting = converting
 * 
 * 
 * 
 */
		byte box1= 127; //smallest box
		short box2=3333; //slightly large box
		int box3=45454545; // large box most commonly used
		long box4=45454545; //slightly large box
		float box5=414564545; // larger box
		double box6=45454545; //largest
		
		int number=(int)15.2; //we can't store the decimal number in a box of type double
		System.out.println(number);
		
		long smallerBox=(long)box2;
		System.out.println(smallerBox);

		short biggerBox=box1;
		
		long box7=box1; // we can do this because 7 is larger than box1
		
	 // as box6 is larger it is double we need type casting to assign the value
		float box8=(float)box6; 
		
		char a=(char)67;
		System.out.println(a);
		
		int box9=(int)box4;
		System.out.println(box9);
}}
