package HelpNotes;
//Write a for loop that will print out every other letter in a String, starting with the first letter.
// These letters should be printed all on one line with no space in between.
import java.util.Scanner;

public class ForLoopStringPrintNoSpaces1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for(int i=0;i<=word.length();i++){//or i+=2
            if(i%2==0){

                System.out.print(word.charAt(i));

            }

        }}}

