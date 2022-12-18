package HelpNotes;

public class Repl135 {
    //test case below(don't change );
    public static void main(String[] args) {
        System.out.println(surround("abcabcabc", "c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology", "o"));//*tehcn(o)l(o)gy
    }
        static String surround (String s, String c){
            return s.replaceAll(c, "(" + c + ")");
        }
    }

