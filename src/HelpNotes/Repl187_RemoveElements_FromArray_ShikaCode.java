package HelpNotes;

import java.util.ArrayList;
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
public class Repl187_RemoveElements_FromArray_ShikaCode {
    public static void main(String[] argf) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        for (int i = 1; i < words.size(); i += 2) {
            System.out.print(words.get(i) + " ");
        }
    }
}