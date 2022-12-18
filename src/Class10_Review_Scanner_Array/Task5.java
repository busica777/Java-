package Class10_Review_Scanner_Array;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] arr = {

                { 10, 9, 10, 20 }, { 23, 30, 54 }, { 21, 30 } };

        int evenSum=0;
        int oddSum=0;
        int sum = 0;

        for (int[] ar : arr) {

            for (int num : ar) {
                if(num%2==0) {
              evenSum+=num;
              } else { 
            	  oddSum+=sum;}
                                   }

            }

        
	
	 System.out.println("Odd Sum = " + oddSum);
	 System.out.println("Even Sum = " +evenSum );


	}

}
