package Class21_Methods;

public class Animal {
    String name;
    String color;
    String breed;
    void sleep(){
        System.out.println("Animals usually sleep for 6 hrs");
    }
    void eat(){
        System.out.println("Gress and meat");
    }


}
class Cat extends Animal{

    void sleep(){
        System.out.println("I like to sleep for 20 hrs");
    }
    void eat(){
        System.out.println("I only like fish");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println(("I like to sleep for 10 hrs"));
    }
    void eat(){
        System.out.println("Dogs like meat");
    }
}