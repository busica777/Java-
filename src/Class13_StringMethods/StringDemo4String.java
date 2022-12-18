package Class13_StringMethods;

import java.util.Arrays;

public class StringDemo4String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Batch 14 is really good";
String[]arr=str.split(" ");

System.out.println(Arrays.toString(arr));
System.out.println(arr[0]);
System.out.println(arr[3]);


String str2="Today is Sunday. Sunday is good. Java is also good";
String[] arr2=str2.split("[.]");
System.out.println(Arrays.toString(arr2));

	}

}
