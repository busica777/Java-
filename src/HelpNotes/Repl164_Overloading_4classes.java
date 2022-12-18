package HelpNotes;

public class Repl164_Overloading_4classes {
    public static void main(String[]aaaa){
        Parent3[] result={new Child4(),new Child5(),new Child3()};
        for (Parent3 pt:result){
            pt.hello();
        }
    }
}
class Parent3{
    void hello(){
        System.out.println("method in FromClass16.RewievClasses.src.Class21.Parent class");
    }
}
class Child4 extends Parent3{
    void hello(){
        System.out.println("method in Child4 class");
    }
}
class Child5 extends Parent3{
    void hello(){
        System.out.println("method in Child5 class");
    }
}
class Child3 extends Parent3{
    void hello(){
        System.out.println("method in Child3 class");
    }
}