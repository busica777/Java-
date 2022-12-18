package HelpNotes;

public class Repl1213VOIDInstanceVar {

        int a;
        double b;
        char c;
        void m1(){
            System.out.println(a+"\n"+b+"\n"+c+"\n");}
        void m2(){
            System.out.println(a+"\n"+b+"\n"+c+"\n");}

        public static void main(String[]aaaa){
            Repl1213VOIDInstanceVar met1=new Repl1213VOIDInstanceVar();
            met1.a=10;
            met1.b=10.23;
            met1.c='a';
            System.out.println();
            met1.m1();

            Repl1213VOIDInstanceVar met2=new Repl1213VOIDInstanceVar();
            met2.a=100;
            met2.b=100.23;
            met2.c='s';
            System.out.println();
            met2.m2();
        }
    }

