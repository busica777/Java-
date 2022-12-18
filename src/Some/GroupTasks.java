package Some;

public class GroupTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Task #5
		
		// Create 2d array of integers. Develop a program which will calculate the sum of even and odd numbers for that array
		int[][] oe= {
				{10,11,10,11},  //1
				{10,11,10,11},   //2
				
		};
		int Sumeven=0, Sumodd=0;
		
		for(int[] even:oe) {
		for (int num:even) {
			
		
			if (num%2==0) {
				Sumeven= Sumeven + num; }
			else {
				Sumodd=Sumodd + num;
		}
		
	}

	System.out.println("Sum of even numbers is " + Sumeven);
	System.out.println("Sum of odd numbers is " + Sumodd ); }}}