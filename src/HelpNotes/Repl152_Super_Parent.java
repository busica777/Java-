package HelpNotes;

public class Repl152_Super_Parent {
    //In FromClass16.RewievClasses.src.Class21.Parent class.
//Create a constructor, it will take a String parameter called city.
//include the logic of printing the parameter value.
//Create another constructor without parameter.
//Include the logic of printing "FromClass16.RewievClasses.src.Class21.Parent Constructor".
//Create a Child Class that should be a subclass of FromClass16.RewievClasses.src.Class21.Parent class
//Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
//In Main class.
//Create an Object of the child class by passing String value "Vienna"
//Expected Output:
    //Vienna
    String city;
    Repl152_Super_Parent(String city){
        this.city=city;
    }
    void print(){
    }
    void printCity(){
        System.out.println(city);
    }
}