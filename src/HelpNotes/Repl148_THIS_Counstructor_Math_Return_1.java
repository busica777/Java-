package HelpNotes;

public class Repl148_THIS_Counstructor_Math_Return_1 {
    public static void main(String[]aaaa){
        HelpNotes.Repl148_THIS_Counstructor_Math_Return m1=new HelpNotes.Repl148_THIS_Counstructor_Math_Return("Blanket",99.98,1);
        double sum1=m1.itemTotalPrice();

        HelpNotes.Repl148_THIS_Counstructor_Math_Return m2=new Repl148_THIS_Counstructor_Math_Return("Mattress",439.18,1);
        double sum2=m2.itemTotalPrice();


        double sum=sum1+sum2;

        System.out.println("You purchased "+sum+" Today");
    }
}