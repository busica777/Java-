package HelpNotes;
//Overload 2 final instance methods:
        //Call them in main method
        //**Expected Output:**
        //Final method with boolean parameter
        //Final method with String parameter
public class Repl170_Keyword {
    final void print(boolean b){
        System.out.println("Final method with boolean parameter");
    }
    final void display(String str){
        System.out.println("Final method with "+str);
    }
    public static void main(String[]aaaaa){
        Repl170_Keyword mn=new Repl170_Keyword();
        mn.print(true);
        mn.display("String parameter");
    }
}