package HelpNotes;
//Declare a static variable number that will hold an integer value:
//
//Access number from the main method and assign value to it.
//
//Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//Print out number using class name and using instance
public class Repl125Static_Int_AccessMain_PrintClassName_Instance {
    static int a;

    public static void main(String[]aaaa){

        Repl125Static_Int_AccessMain_PrintClassName_Instance obj=new Repl125Static_Int_AccessMain_PrintClassName_Instance();

        obj.a=200;
        System.out.println( obj.a);

        System.out.println(Repl125Static_Int_AccessMain_PrintClassName_Instance.a);



    }
}
