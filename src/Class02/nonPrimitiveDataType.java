package Class02;

public class nonPrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String is just 1 example of non-primitive data types
		
		String name="Asma";
		String address="123 address street";
		String phone="123 456 7890";
		
		int age=17;
		//String age="17"; //anything you put inside "" -> becomes a string
		String character="A";
		//ctr=space -> auto completes the statement
		//syso =ctrl+space = system.out.println
		System.out.println(name);
		
		//"My name is" + Asma
		
		System.out.println("My name is "+name);
		
		//Asma is 17 
		System.out.println(name+ " is "+age);
		
		
		String fruit="apple";
		double price=1.99;
		//The price of the apple is 1.99
		
		System.out.println("The price of the "+fruit+" is "+price);
		fruit="mango";
		price=5.99;
		System.out.println("The price of the "+fruit+" is "+price);
		/* the price of the mango is 5.99
		 * to attach any value(int,double,boolean, char, string etc)
		 *+ next to the String acts as Concatenation
		 */
		
		
		
	}

}
