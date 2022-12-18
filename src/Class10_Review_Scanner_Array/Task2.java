package Class10_Review_Scanner_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Using Scanner create an array of countries. When an array is created,
         * retrieve all values from it and while retrieving those values print capital
         * for each country. (use 2 different loops)
         */
		

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the size of the array");
        //asks the user for a number
        int size = scanner.nextInt();
        // it creates an array of the above size 
        int[] arr = new int[size];


        for(int i=0;i<size;i++) {
            System.out.println("Please Enter an int number");
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
      

        System.out.println("Sum of all the numbers from the Array is "+size);

    
		
	}

}
