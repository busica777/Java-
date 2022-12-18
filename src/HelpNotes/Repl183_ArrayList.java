package HelpNotes;
//Create an array list that will hold String Objects
//Find out wether array list is empty or not.
//Add String value "Syntax" to it
//Find out wether array list is empty or not.
//Expected Output:
//true
//false
import java.util.ArrayList;
public class Repl183_ArrayList {


        public static void main(String[]aaaa){
            ArrayList<String> names=new ArrayList<>();
            names.add("Syntax");
            System.out.println(names.contains("Syntax"));
            System.out.println(names.isEmpty());
        }
    }

