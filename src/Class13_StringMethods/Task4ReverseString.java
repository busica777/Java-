package Class13_StringMethods;

public class Task4ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="This is sentence i want to reverse";
String[] arr=str.split(" ");

for(int i=0; i<arr.length; i++) {
	
for(int y=arr[i].length()-1; y>=0; y--){
	
	System.out.print(arr[i].charAt(y));
	}
		
	System.out.print(" ");
}}}
