package HelpNotes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Create an array list to type String.
//Add these values below to your arraylist
//hi
//yo
//sup
//yolo
//boop
//Remove 1, 3, 5 element from an array
//print remained values one by one in one line
//**Expected Output:**
//yo yolo
public class Repl187_RemoveElements_FromArray_ShortCode {



        public static void main(String[]aaaa){
            List<String> list=new ArrayList<>(Arrays.asList("hi","yo","sup","yolo","boop"));
            List<String> list1=new ArrayList<>(Arrays.asList("hi","sup","boop"));

            list.removeAll(list1);

            for(String elms:list){
                System.out.print(elms+" ");

            }
        }
    }

