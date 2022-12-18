package HelpNotes;

import java.util.Scanner;

public class ScannerArrayForLoopSubstring {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int numOfEl=5;
        String result="";
        String[]el=new String[numOfEl];

        int i=0;
        for(i=0;i<numOfEl;i++){
            el[i]=input.nextLine();

            System.out.print(el[i].substring(0, 3));
            System.out.println("");
        }



    }}



