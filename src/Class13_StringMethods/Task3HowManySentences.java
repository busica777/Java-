package Class13_StringMethods;

public class Task3HowManySentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a String that should be combination of letters, numbers and special characters. 
//Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
	
	String p="Is it Saturday? Is it raining? Do we have a Java class today?";
	
	String []arr=p.split("[?]");
	
	System.out.println(arr.length);
	}

}
