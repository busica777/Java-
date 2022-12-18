package HelpNotes;
//Create an Interface with name as MyInterface
//Create two undefined methods method1 and method2
//Inherit the MyInterface to Main Class.
//Execute both methods
//**Expected Output:**
//implementation of method1
//implementation of method2

public class Repl174_Interface_implementation implements HelpNotes.Repl174_Interface {
        public void method1(){
            System.out.println("implementation of method1");
        }
        public void method2(){
            System.out.println("implementation of method2");
        }
        public static void main(String[]aaaa){
            Repl174_Interface myint=new Repl174_Interface_implementation();
            myint.method1();
            myint.method2();
        }
    }
