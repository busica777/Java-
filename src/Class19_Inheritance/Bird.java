package Class19_Inheritance;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color, int age, double weight) { //constructor in parent class
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    void printInfo(){
        System.out.println("Name "+name+ " Color "+color+" Age "+age+" Weight "+weight);
    }
}

class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green",2,1);
        parrot.printInfo();

        Crow crow=new Crow("crow","black",3,1.5);
        crow.printInfo();
        Sparrow sparrow=new Sparrow("Sparrow","White",3,1.5);
        crow.printInfo();
    }
}

