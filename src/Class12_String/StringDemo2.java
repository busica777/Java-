package Class12_String;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String firstname="Olena";
	String lastName="Dudka";
		
		System.out.println(firstname+" "+lastName); //mostly used
		System.out.println(firstname.concat(" ").concat(lastName)); //adding space
		System.out.println(firstname.concat(lastName)); // no space
	
	String str=" ";

	System.out.println(str.isEmpty());
	//System.out.println(str.isBlank());
	
	
	}

}
