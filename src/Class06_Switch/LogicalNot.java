package Class06_Switch;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	boolean boo=!true;
	System.out.println(boo); //false
		
	
	boolean boo1=!false;
	System.out.println(boo1); //true
	
	boolean rain=false;
	if(!rain)
	{System.out.println("I'll go for a walk");}

	String day="Sunday";
	if(!day.equals("Sunday"))
	{System.out.println(("Today is nor Sunday"));}
	
	System.out.println("----------------------------");
	
	boolean checkboxSelected=false;
	
	if(!checkboxSelected)
	{System.out.println("Then we'll click and select it");}
	
	
	System.out.println("End of the programm");
}}
