package Class13_StringMethods;

public class Task5PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//How would you check if String is palindrome or not? aba=> true
		//Abbc =>false
		
String str="Bucshikbuc",reverseStr="";

int strby=str.length();

for (int i=(strby-1); i>=0;--i) {
	reverseStr=reverseStr+str.charAt(i);}
	
if(str.toLowerCase().equals(reverseStr.toLowerCase())) {
	System.out.println(str+"is a palidrome string.");
	}
else {
	System.out.println(str+"is not a palidrome String.");
}
}
}
