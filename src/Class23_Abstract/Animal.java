package Class23_Abstract;

public abstract class Animal {
    abstract void eat();
      //  System.out.println("Animals usually eat plants and meat");

    abstract void sleep();
     //   System.out.println("Animals usually sleep for 10-12 hrs");
void walk(){   //we can have NOT ABSTRACT methods in ABSTRACT class too
    System.out.println("Cat walk");
}
}
class Cat extends  Animal{
    @Override
    void eat(){
        System.out.println("Cats like fish");
    }
    void sleep(){
        System.out.println("Cats like to sleep 12 to 16  hrs");
    }
    void showAttitiude(){
        System.out.println("HMM hmm hmm HMM");
    }
}
 class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Cats like watermelon");
    }
    void sleep(){
        System.out.println("Cats sleep for 10-15 hrs");
    }

}