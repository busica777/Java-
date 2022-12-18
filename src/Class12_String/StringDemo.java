package Class12_String;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Proper way to create an object
	String str=new String("Java");
	
	//Simpler and shorter way provided by Java Creators to make our life a little easier
	String name="Buc Shika Shik Buc Busika"; //only works for String and Wrapper classes
	/* Counts the number of characters in a string including the spaces
	 */
	
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name can't be more than 15 characters");
		}
		
		
		
		
		
	}

}
