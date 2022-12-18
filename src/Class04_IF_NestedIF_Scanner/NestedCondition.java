package Class04_IF_NestedIF_Scanner;

public class NestedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double moneyInMyAccount=10000;
		String season="Spring";
		if(season.equals("Spring"))
		{
			
			
			if(moneyInMyAccount>30000)
			{
				System.out.println("let's go vacations");
			} 
			else
			{
				System.out.println("i need to save more");
			}
			
		}
	}

}
