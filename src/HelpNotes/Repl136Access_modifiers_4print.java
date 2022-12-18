package HelpNotes;

public class Repl136Access_modifiers_4print {
    private void m1(){
        System.out.println("This is Private Method");
    }
    public void m2 (){
        System.out.println("This is Public Method");
    }
    protected void m3(){
        System.out.println("This is Protected Method");
    }
    void m4(){
        System.out.println("This is Default Method");
    }

    public static void main(String[]aaaa){
        Repl136Access_modifiers_4print print=new Repl136Access_modifiers_4print();
        print.m1();
        print.m4();
        print.m3();
        print.m2();
    }}