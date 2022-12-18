package Class12_String;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Shah";
        String  str2="Shah";
        String str3=new String("Shah");

        if(str.equals(str2)) {
    //    if(str==str2) {
        //if(str.equals("Shah")) {
            System.out.println("I found it");
        }
        /*equals checks if two Strings are exactly the same with exact same case
         * equalsIgnoreCase checks if two Strings are exactly the same but doesn't care about the case of letters
         * */
        if(str.equalsIgnoreCase("shah")) {
        	System.out.println("I found it with equalsIgnoreCase");
        	
        	
        }
    }}