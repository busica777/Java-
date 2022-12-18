package HelpNotes;

public class Repl144_3Constructors_1 {
    public static void main(String [] args){
        HelpNotes.Repl144_3Constructors m1=new HelpNotes.Repl144_3Constructors("Eggs",3.0,"Produce",true,10);
        m1.display();
        System.out.println();

        HelpNotes.Repl144_3Constructors m2=new HelpNotes.Repl144_3Constructors("Paper Towels", 2.0,"misc",false,24);
        m2.display();
        System.out.println();

        HelpNotes.Repl144_3Constructors m3=new Repl144_3Constructors("Paper Towels", 2.0,"null",false,0);
        m3.display();
    }
}
