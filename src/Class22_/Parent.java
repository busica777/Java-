package Class22_;

public class Parent {
    static void print(){
        System.out.println("Hello");
    }
}
class Child extends Parent{
    static void print(){
        System.out.println("Hey");
    }
}
class Test{
    public static void main(String[] args) {
        Child.print();
    }
}