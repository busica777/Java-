package HelpNotes;

public class Repl171_Abstraction_Void {
    void m(){
        System.out.println("m1 without parameters");
    }
    void m1(){
        System.out.println("m1 method with parameter");
    }
    public static void main(String[]aaaa){
        Repl171_Abstraction_Void mn=new Repl171_Abstraction_Void();
        mn.m();
        mn.m1();
    }
}
abstract class Dad{
    abstract void m();
    abstract void m1();
}
