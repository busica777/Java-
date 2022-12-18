package Class05;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean allergy = true;

		String allergyType = "pollen";

		if (allergy) {
			System.out.println("Let's check what allergy you have");

			if (allergyType.equalsIgnoreCase("Pollen"))
		//equalsIgnoreCase when we use lower and capital for the same words
			{
				System.out.println("Try to stay indoors when trees are");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("Please stay away from peanuts");
			} else if (allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			} else {
				System.out.println("we nee to do some test");
			}
		} else {
			System.out.println("Yourare lucky");
		}

	}

}
