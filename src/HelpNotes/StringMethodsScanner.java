package HelpNotes;

import java.util.Scanner;

public class StringMethodsScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = sc.nextLine();
        String lang;

        switch(language){

            case "Java":
                lang="Java is a programming language";
                break;

            case "C":
                lang="C is a procedural programming language";
                break;

            case "C++":
                lang="C++ is a middle-level programming language";
                break;

            default:
                lang="Doesn't match any programming language";
                break;
        }
        System.out.println(lang);
    }
}


