package Class04_IF_NestedIF_Scanner;

public class NestedifCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time=5;
		String day="monday";
		/* 
		 * it is called outer condition if it is true then only inner condition will be checked if it is
		 * false nothing from inner if condition will be executed it is like main door
		 * if main door is closed we can't enter the building
		 * /
		 */
		// outer if-condition
		if(day.equals("monday")){// as String is a non primitive we can't use== sing we have to use .equals method
			
		//inner if-condition
			if (time>7) {
				System.out.println("Let's go to office");
			}
			if(time<6) {
				System.out.println("Let's sleep more");
			}
		}

}}
