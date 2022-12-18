package HelpNotes;
//Create class A
//declare variable int i=10;
//Create class B  extends A
//declare variable int i=20;
//create a method to display value of variable i from both classes
//In Main Class create an object of subclass and call method display
//**Expected Output:**
//  20
//10
public class Repl156_SuperKeyWord {
    public static void main(String[]aaaa){
        B1 b=new B1();
        b.display();
    }
}
class A{
    int i=10;
}
class B1 extends A{
    int i=20;

    void display(){
        System.out.println(i);
        System.out.println(super.i);
    }
}
