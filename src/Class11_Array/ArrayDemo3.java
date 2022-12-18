package Class11_Array;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double size =10;
		int[] arr=new int[10];
		int start=11;
		
		 for(int i=0;i<arr.length;i++) {
			 
			 arr[i]=start;
			 start++;
		 }
			System.out.println(Arrays.toString(arr));	
				
				
				
	}

}
