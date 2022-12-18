package HelpNotes;

import java.util.Scanner;

public class StringMethodScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String word=input.next();
        System.out.println(word.substring(0,3));
    }
}


