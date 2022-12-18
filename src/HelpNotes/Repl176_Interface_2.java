package HelpNotes;
//Step 1: Create FromClass16.RewievClasses.src.Class21.Parent Interface as ParentInterface that will have undefined method parentMethod without parameters.
//Step 2: Create an Interface as ChildInterface that will be a child interface of FromClass16.RewievClasses.src.Class21.Parent Interface and will have a method childMethod without parameters.
//Step 3: Inherit the Main class to Child Interface.
//Step 4: Execute both methods
//Expected Output:
//FromClass16.RewievClasses.src.Class21.Parent Method-welcome to Syntax
//Child Method-hello Syntax

    public class Repl176_Interface_2 implements ChildInterface{
        public void childMethod(){
            System.out.println("Child Method-hello Syntax");
        }
        public void parentMethod(){
            System.out.println("FromClass16.RewievClasses.src.Class21.Parent Method-welcome to Syntax");
        }
        public static void main(String[]aaaa){
            ChildInterface chInt=new Repl176_Interface_2();
            chInt.parentMethod();
            chInt.childMethod();
        }
    }
    interface ParentInterface{
        void parentMethod();
    }
    interface ChildInterface extends ParentInterface{
        void childMethod();
    }