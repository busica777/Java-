package quiz1;

public class SwitchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char direction='N';
		char west='W';
		
		switch(direction) {
		case'N':
			System.out.println("North");
		    break;
		case'E':
			System.out.println("East");
			break;
		case 'w':
			System.out.println("West");
			break;
		case 'S':
			System.out.println("South");
		}
		
		
	}

}
