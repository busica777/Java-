package Class10_Review_Scanner_Array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
         * Create a 2D array of integer values. Print the sum of all numbers
         */
int [][] arr= {
		
		{10,10,10,20},
		{25,30,54},
		{20,30}
		};


int sum=0;
for (int []ar:arr) {
	
	for(int num:ar) {
		sum+=num;
	}
	
	
}
System.out.println(sum);
	}

}
