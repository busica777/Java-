package HelpNotes;

public class Repl157_Keyword {
    public static void main(String[]aaaa){
        Child1 m2=new Child1();
        m2.m1();
    }
}
class Parent {
    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child1 extends Parent {
    void m1(){
        System.out.println("m1 method in child class");
        super.m1();
    }
}
