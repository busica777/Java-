package HelpNotes;

import java.util.Scanner;

public class StringScannerIgnoreCasePalidrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below
        String reverse="";

        for(int i=givenString.length()-1;i>=0;i--){
            reverse=reverse+givenString.charAt(i);
        }

        System.out.print(reverse.equalsIgnoreCase(givenString));

    }
}

