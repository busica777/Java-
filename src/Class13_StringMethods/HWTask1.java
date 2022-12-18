package Class13_StringMethods;

public class HWTask1 {
	/*
    Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters,
    print the character in the middle of the String.
     */
	
	
	public static void main(String[]aaaa) {
		
		String str="Hello";
		int length=str.length();
		if(!str.isEmpty()&&str.length()%2!=0&&str.length()>=3) {
			
			int middleIndex=str.length()/2;
			System.out.println(str.charAt(middleIndex));
			
		}
	}
}
