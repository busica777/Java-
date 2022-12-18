package Class06_Switch;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// we need to ask a user where he?she is from
		
		Scanner in=new Scanner(System.in);
		System.out.println("Please tell me where are you from?");
		
		String country=in.nextLine();
		String favoriteFood;
		
		switch(country) {
		
		case "usa":
		favoriteFood="burgers and fries";
		break;
		
		case "Kazakhstan":
		favoriteFood="beshbarmak";
		break;
		
		case "Turkey":
			favoriteFood="adana kebab";
				break;
		case "Venezuela":
			favoriteFood="Arepa";
			break;
			
		case "India":
			favoriteFood="Chicken curry";
			break;
		case "Yemen":
			favoriteFood="Mandi";
			break;
		case "Vietnam":
			favoriteFood="Pho";
			break;
		default:
			favoriteFood="Unknown";
			break;
			}
	
		System.out.println("You are from " +country+ " and your favorite  food is "+favoriteFood);
		
	}

}
