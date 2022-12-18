package HW;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Print numbers from 1 to 100 in 1 line with space
	for(int a=1;a<=100; a++) {
		System.out.print(a + " ");
	}
	//2. Print numbers from 100 to 1

	for(int b=100;b>=1;b--)	{
		System.out.println(b);
	}
	//3. Print even numbers from 20 to 1 (2 ways)	
	for(int c=20;c>=1;c-=2) {
		System.out.println(c);
	}
	int d=20;
	while(d>=1) {
		System.out.println(d);
		d-=2;}
	//4. Print odd numbers between 20 and 50 (2 ways)
	
	for(int e=20; e<=50;e ++) {
		if(e%2 ==0 ) {
			System.out.println(e + " ");}
		}
	System.out.println("-----------------------------");
		int e=20;
		while(e<=50) {
			if (e%2==0) 
			System.out.println(e);
		e++;}
		}
		
}
