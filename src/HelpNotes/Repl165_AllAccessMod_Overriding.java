package HelpNotes;
//FromClass16.RewievClasses.src.Class21.Parent class create 4 methods with different level of access modifiers. In each method print "I am parent public/protected/default/private method".
//Override methods in child class
//In Main Class create object of the child class and see which methods are available
//Expected Output:
//I am a child public method
//I am a child protected method
//I am a child default method
public class Repl165_AllAccessMod_Overriding {

        public void display(){
            System.out.println("I am parent public protected method");
        }
        protected void print(){
            System.out.println("I am parent protected method");
        }
        void show(){
            System.out.println("I am parent default method");
        }
        private void test(){
            System.out.println("I am parent private method");
        }
    }
class Child6 extends Repl165_AllAccessMod_Overriding{
    public void display(){
        System.out.println("I am a child public method");
    }
    protected void print(){
        System.out.println("I am a child protected method");
    }
    void show(){
        System.out.println("I am a child default method");
    }
    private void test(){
        System.out.println("I am a child private method");
    }
}
class Main1 {
    public static void main(String[]aaaa){
        Child6 output=new Child6 ();
        output.display();
        output.print();
        output.show();
        //output.test();
    }
}