package HelpNotes;

import java.util.Scanner;

public class ScannerPrintVowelsOnly {
    public static void main(String[] args) {
        Scanner inp1 = new Scanner(System.in);
        System.out.print("In:");
        String word1 = inp1.nextLine();
        System.out.print(word1.replaceAll("[^a,e,i,u,o]",""));
    }
}
