package Class16;

public class StringParameterReturnPrivate {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

     private static String getVowels(String str){
       //String newStr=str.replaceAll("[^aeiouAEIOU]","");
         //return new String
     return str.replaceAll("[^aeiouAEIOU]","");
     }

    public static void main(String[] args) {
        System.out.println(getVowels("Humera"));
    }
}
