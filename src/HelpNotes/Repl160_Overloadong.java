package HelpNotes;

public class Repl160_Overloadong {
    void print(int a){
        System.out.println(a);
    }
    void print(String schoolName){
        System.out.println(schoolName);
    }
    void print(double price){
        System.out.println(price);
    }
    public static void main(String []aaaa){
        Repl160_Overloadong result=new Repl160_Overloadong();
        result.print(100);
        result.print("Syntax Technologies");
        result.print(100.09);
    }
}
