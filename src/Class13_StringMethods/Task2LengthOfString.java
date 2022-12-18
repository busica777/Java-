package Class13_StringMethods;

public class Task2LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
String a="sfnew454w%!g5";
		
		char[] ch = a.toCharArray();
		int letter = 0;
		int num = 0;
		
		for(int i = 0; i < a.length(); i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if (Character.isDigit(ch[i])){
				num ++ ;
			}
		}
		int numbers=letter+num;
		System.out.println("The string is :sfnew454w%!g5");
		System.out.println("The String contain " +numbers+" Alphanumeric characters");
		
			}
	}
	

