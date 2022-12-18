package HelpNotes;
//Create a Super Class Tea that will have:
//
//- instance variable teaType;
//- constructor that will initialize
//- unimplemented method addSugar(),
//Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
//In main class create an object of 2 Child and assign them to FromClass16.RewievClasses.src.Class21.Parent reference type.
//Execute method addSugar from both classes.
//**Expected Output:**
//For Lemon Tea we need 2 spoons of sugar
//For Chai Tea we need 1 spoon of sugar
public class Repl173_AbstractClass_2from1 {
    public static void main(String []aaaa){
        LemonTea lm=new LemonTea("Lemon Tea");
        lm.addSugar();

        ChaiTea ch=new ChaiTea("Chai Tea");
        ch.addSugar();
    }
}
abstract class Tea{
    String teaType;
    Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea{
    LemonTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");
    }
}
class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super(teaType);
    }
    void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }
}