package HelpNotes;

public class Repl139StringMethodForLoop {
        static String alphabetical(String str){
            String  s="";
            char letter=str.charAt(0);
            for(int i=2;i<str.length();i++){
                if(str.charAt(i-1)<str.charAt(i)){
                    s+=str.charAt(i);
                }
            }
            return s;
        }


        public static void main(String[]yhgf){
            System.out.println(alphabetical("hello"));
            System.out.println(alphabetical("software"));
            System.out.println(alphabetical("language"));
        }}
