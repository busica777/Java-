package HelpNotes;

public class Repl131_Static_Return_3rd_letter {
    static String thirdLetter(String s){
        String store="";
        for(int i=0; i<s.length(); i+=3){
            store+=s.charAt(i);
        }
        return store;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}