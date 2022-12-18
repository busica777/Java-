package Class12_String;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love java Programing";
		/*
		 * charAt returns us the character at a specific index
		 * */
		System.out.println(str.charAt(3)); //prints single letter from String
		
		for(int i=0; i<str.length(); i++) {
			//prints only the characters not spaces
			if(!(str.charAt(i)==' ')) {}
			System.out.println(str.charAt(i));
			
		}
		
	}

}
