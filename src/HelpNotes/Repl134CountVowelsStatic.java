package HelpNotes;

public class Repl134CountVowelsStatic {
    static int countVowels(String s)
    {
        String str=s.replaceAll("[^aeiou]","");
        int size=str.length();
        return size;}




    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}