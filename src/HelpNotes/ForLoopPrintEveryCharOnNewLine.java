package HelpNotes;
//Write a for loop that will loop through every character of a word and print out each character, each on a separate line
import java.util.Scanner;

public class ForLoopPrintEveryCharOnNewLine {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i=0; i<word.length();i++){
            if(!(word.charAt(i)==' ')){
                System.out.println(word.charAt(i));
            }
        }
    }}


