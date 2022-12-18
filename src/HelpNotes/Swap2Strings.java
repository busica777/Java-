package HelpNotes;

public class Swap2Strings {
    public static void main(String[] args) {
        String a="Hello Syntax friends";
        String b="Welcome Syntax family";

        a=a+b;

        b=a.substring(0,a.length()-b.length());
        a= a.substring(b.length());

        System.out.println(a);


    }
}

