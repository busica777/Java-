package HelpNotes;

public class Repl127Static_non_Static_Execute {
    /*Create two methods:

    The first method should be a non-static method that will print out the following message:

            "Programming is amazing."

    The second method should be a static method that will print out the following message:

            "Java is awesome."

    Execute both methods */
    public void m1(){
        System.out.println("Programming is amazing.");
    }
    public static void m2(){
        System.out.println("Java is awesome.");
    }
    public static void main(String[]aaaa){
        Repl127Static_non_Static_Execute print=new Repl127Static_non_Static_Execute();
        print.m1();
        print.m2();
    }
}