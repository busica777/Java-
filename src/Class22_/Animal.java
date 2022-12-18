package Class22_;

public class Animal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hrs");
    }
}
class Panda extends Animal{
    void eat(){
        System.out.println(("Pandas eat Bamboos"));
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println("Pandas sleep for 14 hrs");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Cats like to eat fish");
    }
}