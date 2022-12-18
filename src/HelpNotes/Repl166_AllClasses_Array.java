package HelpNotes;
//Create a class FromClass16.RewievClasses.src.Class21.Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
//Create a subclass Cat in which override method sleep
//Create 3 Kitten subclasses of a Cat class and override method eat
//for 1 kitten - eats milk
//for 2 kitten - eats snack
//for 3 kitten - eats everything
//In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
//Expected Output:
//Cat eats
//Cat sleeps a lot
//kitten1 eats milk
//kitten1 sleeps a lot
//kitten2 eats snacks
//kitten2 sleeps a lot
//kitten3 eats everything
//kitten3 sleeps a lot
public class Repl166_AllClasses_Array {
    public static void main  (String[]aaaa){
        Animal[]animal={new Cat("Cat"), new Kitten1("kitten1"),new Kitten2("kitten2"),new Kitten3("kitten3")};
        for( Animal an:animal){
            an.eat();
            an.sleep();
        }
    }
}
class Animal{
    String name1;
    Animal(String name1){
        this.name1=name1;
    }
    void eat(){
        System.out.println(name1+" eats");
    }
    void sleep(){
        System.out.println(name1+" sleeps");
    }
}
class Cat extends Animal{
    Cat(String name1){
        super(name1);
    }
    void sleep(){
        System.out.println(name1+" sleeps a lot");
    }
}
class Kitten1 extends Cat{
    Kitten1 (String name1){
        super(name1);
    }
    void eat(){
        System.out.println(name1+" eats milk");
    }
}
class Kitten2 extends Cat{
    Kitten2(String name1){
        super(name1);
    }
    void eat(){
        System.out.println(name1+" eats snacks");
    }
}
class Kitten3 extends Cat{
    Kitten3(String name1){
        super(name1);
    }
    void eat(){
        System.out.println(name1+" eats everything");
    }
}
