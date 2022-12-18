package Class18_Constructor;

public class Instance2Constructors {
    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    public static void main(String[] args) {
        Book b1 = new Book("The Captain's Daughter ", 1836, 194, 17);
        Book b2 = new Book("Anna Karenina ", 1878, 864);
    }
}
//CONSTRUCTOR 1
class Book {
    String name;
    int age;
    int num;
    int price;
    //CONSTRUCTOR 2
 public Book (String name, int age,int num, int price){

    this(name,age,num); //this helps to avoid duplicate
    this.price=price;// this helps to explicitly refer to instance Variable
     System.out.println();
}

    public Book (String name, int age,int num) {

        this.name=name; //this helps to avoid duplicate
        this.age=age;// this helps to explicitly refer to instance Variable
        this.num=num;

  }


  }
