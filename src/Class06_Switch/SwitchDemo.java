package Class06_Switch;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if statement is condition based
		//it executes block 
		int day=5;
		if(day==1) {
			System.out.println("monday");
		}
		else if(day==2) {
			System.out.println("tuesday");
		}
		else if (day==3) {
			System.out.println("wednsday");
		} 
		else if (day==4) {
			System.out.println("Trursday");
		} 
		else if (day==5) {
			System.out.println("Friday");
		}
		else if (day==6) {
			System.out.println("Saturday");
		}
		else if(day==7) { 
		    System.out.println("Sunday");
		}
		else {
			System.out.println("Please enter a valid day number(1-7)");
				}
		
		System.out.println("---------------------------------------");
		
		String name;
		
		//switch case is values based
		//it knows the values=> jump into matching case
		switch(day) {
		case 1:
			name="Monday";
			break;
		case 2:
			name="Tuesday";
			break;
		case 3:
			name="Wednsday";
			break;
		case 4:
			name="Thursday";
			break;
		case 5:
			name="Friday";
			break;
		case 6: 
			name="Saturday";
			break;
		case 7:
			name="Sunday";
			break;
		default:
			name="Invalid";
			break;
			
	
		} System.out.println(name);
	}

}
