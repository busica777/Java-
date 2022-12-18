package HelpNotes;

public class Repl159_Overloading {
    void sub(int a, int b, int c, int d){
        System.out.println((a-b-c-d)+" (should come from subtracting 4 numbers)");
    }
    void sub(int a, int b,int c){
        System.out.println((a-b-c)+" (should come from subtracting 3 numbers)");
    }
    void sub(int a, int b){
        System.out.println((a-b)+" (should come from subtracting 2 numbers)");
    }
    public static void main(String[]aaaa){

        Repl159_Overloading m=new Repl159_Overloading();
        m.sub(60,10,5,5);
        m.sub(60,20,10);
        m.sub(40,20);
    }
}
