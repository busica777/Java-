package Class13_StringMethods;

public class StringUnits {

	void printAllIndexes(String str,char c) {
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==c) {
				System.out.println(i);
			}
		}
		
	}
	
	
}
