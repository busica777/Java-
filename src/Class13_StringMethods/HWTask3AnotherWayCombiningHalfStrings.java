package Class13_StringMethods;

public class HWTask3AnotherWayCombiningHalfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String motherName = "Mary";
        String fatherName = "Daniel";
        boolean isBoy = false;

        if (isBoy) {
            String firstHalf = fatherName.substring(0, fatherName.length() / 2);
            String secondHalf = motherName.substring(motherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        } else {
            String firstHalf = motherName.substring(0, motherName.length() / 2);
            String secondHalf = fatherName.substring(fatherName.length() / 2);
            System.out.println(firstHalf + secondHalf);

        }
    }
}