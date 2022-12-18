package HelpNotes;

public class Repl158_Keyword {
    public static void main (String[]aaaa){
        Child2 child=new Child2("Fairfax");
        child.print();
    }
}

class Parent1{
    String city;
    Parent1(String city){
        this.city=city;}
    public void print(){
        System.out.println("City name "+city);
    }
}
class Child2 extends Parent1{
    Child2(String city){
        super(city);
    }
}
