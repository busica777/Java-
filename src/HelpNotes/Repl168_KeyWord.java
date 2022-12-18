package HelpNotes;
//Create an instance final method that will reverse a String and return that new String
//Call method from the main method
//Expected Output:
//olleh
public class Repl168_KeyWord {

        final void display(){
            String s="hello";
            String reverseW="";

            for(int i=s.length()-1;i>=0;i--){
                reverseW=reverseW+s.charAt(i);}

            System.out.println(reverseW);
        }
        public static void main(String []aaaa){
            Repl168_KeyWord m=new Repl168_KeyWord();
            m.display();
        }
    }
