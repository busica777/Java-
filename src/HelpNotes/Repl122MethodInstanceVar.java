package HelpNotes;

public class Repl122MethodInstanceVar {
    String country;
    String capital;
    long size;
    void m1() {
        System.out.println("The capital of "+country+" is "+capital+" and population is "+size);
    }

    public static void main(String[]aaaa){
        Repl122MethodInstanceVar met1=new Repl122MethodInstanceVar();
        met1.country="USA";
        met1.capital="Washington DC";
        met1.size=330000000;
        met1.m1();

        Repl122MethodInstanceVar met2=new Repl122MethodInstanceVar();
        met2.country="Kazakhstan";
        met2.capital="Astana";
        met2.size=18500000;
        met2.m1();
    }
}
