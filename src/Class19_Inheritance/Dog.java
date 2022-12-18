package Class19_Inheritance;


public class Dog extends Animal{


    public Dog(String name, String breed, String color){ //only 1 public class can be in a file
         /* this.name = name;
        this.breed = breed;
        this.color = color;*/ //instead we use super
       super(name, breed, color);
    }
}
class Cat extends Animal{


    Cat(String name, String breed, String color) { //constructor
       /* this.name = name;
        this.breed = breed;
        this.color = color;*/ //instead we use super
        super(name,breed, color); //super comes from parent class FromClass16.RewievClasses.src.Class21.Animal(....){this.name=name;...
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Dog dog=new Dog("jacky","German","green");
        dog.printInfo();
    }
}