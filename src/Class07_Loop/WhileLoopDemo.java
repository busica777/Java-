package Class07_Loop;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//all numbers from 1 to 10
		
		int num=1;
		while(num<=10) {
			System.out.println(num +" ");
			num++;
		}
		System.out.println("-------------");
		//print all numbers from 10 to 25
		
		int a=10;
		while (a==10||a<=25) {
		System.out.println(a+"");
		a++;
		}
		{System.out.println("------------------------------");}
		
		//print from 10 to 1
		
		int b=10;
		while(b>=1) {
			System.out.println(b);
			b--;
		}
		{System.out.println("****************");}
		
		
		//print all even from 1 to 20
		
		int c=1;
		while(c<=20) 
		{
			System.out.println(c+" ");
			c+=2;
		}
		{System.out.println("**************");}
		
		int e=1;
		while(e<=10) 
		{ if (e%2==0) {
			System.out.println(e+" ");}
			e++;}
		
		
		{System.out.println("--------------------------");
		//print all from 50 to 20
		int f=50;
		while(f>=20) {
			System.out.println(f);
			f--;}
		
	}

}}

