package HelpNotes;

public class Repl116BooleanMethodEVEN {
    boolean numbers(int a, int b){
        if(a%2==0 && b%2==0){
            return true;

        } else{
            return false;
        }}
    public static void main(String []aaaa){
        Repl116BooleanMethodEVEN buc=new Repl116BooleanMethodEVEN();
        System.out.println(buc.numbers(4,6));
        System.out.println(buc.numbers(3,4));
        System.out.println(buc.numbers(-1,1));
    }

}