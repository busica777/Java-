package HelpNotes;

public class Repl138Call_Method_ByMain_Class_Name {
    void def(){
        System.out.println("default");
    }
    protected void pro(){
        System.out.println("protected");
    }
    public void pub(){
        System.out.println("public");
    }
}

class SecondClass {
    public static void main(String[]aaaa){
        Repl138Call_Method_ByMain_Class_Name print=new Repl138Call_Method_ByMain_Class_Name();
        print.def();
        print.pro();
        print.pub();

    }
}
