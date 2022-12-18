package HelpNotes;

public class Print_Instance_Var_alltype {
    int a;
    String b;
    double c;
    boolean d;
    float e;

    void m1(){
        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n");
    }
    public static void main(String[]aaaa){
        Print_Instance_Var_alltype met1=new Print_Instance_Var_alltype();
        met1.a=0;
        met1.b="null";
        met1.c=0.0;
        met1.d=false;
        met1.e=0.0F;
        met1.m1();
    }

}