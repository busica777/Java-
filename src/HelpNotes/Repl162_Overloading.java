package HelpNotes;

public class Repl162_Overloading {

        public static void main(String[] args) {
            Repl162_Overloading m=new Repl162_Overloading();
            m.print();
            m.print("with int parameter");
        }
        static void print(){
            System.out.println("static method without parameter");
        }
        static void print(String str){
            System.out.println("static method "+ str);
        }
    }