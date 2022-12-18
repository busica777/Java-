package HelpNotes;

public class Repl154_SuperKeyWord_Parent {
    //In FromClass16.RewievClasses.src.Class21.Parent Class.
    //Create a no-argument constructor and include the logic to print "FromClass16.RewievClasses.src.Class21.Parent Constructor without argument"
    //Create another constructor that takes one parameter of integer type called number.
    //include the logic to print the value of the number.
    //In Child class.
    //Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
    //Overload the constructor by adding one parameter of type integer
    //Inside the constructor call the parameterized parent class constructor.
    //In Main Class.
    //Create an object of Child without passing any argument.
    //And then another object of Child class by passing the value "10". run the application.
    //**Expected Output:**
    //FromClass16.RewievClasses.src.Class21.Parent Constructor without argument
    //Child Constructor without argument
    //10
    int num;
    Repl154_SuperKeyWord_Parent(int num){
        this.num=num;
    }
    void print(){
        System.out.println(num);
    }
    Repl154_SuperKeyWord_Parent(){
        System.out.println("FromClass16.RewievClasses.src.Class21.Parent Constructor without argument");
    }
}
class Child{
    Child(){
        System.out.println("Child Constructor without argument");
    }
    int num1;
    Child(int num1){
        this.num1=num1;
    }
    void print(){
        System.out.println(num1);
    }
}