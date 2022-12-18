package Class06_Switch;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//matching case must of same data type as a variable
		//no duplicated cases in switch(inside the formula)
		//y OR Y
		char choice='K';
		String answer;
		switch(choice)	{
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
		
		
		System.out.println(answer);
		
		// limitations of SWITCH CASE
		/*switch case cannot use logical operators
		 * switch case cannot use relational operators
		 * 
		 * 
		 * 
		 * CANNOT work with boolean values
		 * CE; Cannort switch on a value of type boolean
		 * boolean boo=true;
		 * switch(boo){}
		 * 
		 * CANNOT work with float/double/long
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
