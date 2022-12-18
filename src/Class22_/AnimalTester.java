package Class22_;

public class AnimalTester {
    public static void main(String[] args) {


        Cat cat = new Cat();
        cat.sleep();
        cat.eat();
        Animal animal=new Panda(); //Upcasting
       // Panda panda=new FromClass16.RewievClasses.src.Class21.Animal(); //DownCasting not allowed

        Animal animal1=new Cat();
        Animal[] animals={new Cat(),new Panda()};
    }
}