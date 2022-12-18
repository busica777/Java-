package ReviewInstanseLocalStatic;

public class AccessMethods {
    public static void main(String[] args) {
        DogInstance.breed="Huskey";



        DogInstance dog1=new DogInstance(); //

        //how to access instance variables?

        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        DogInstance dog2=new DogInstance();
        System.out.println(dog2.name);
        dog2.name="Tommy";
        dog2.weight=10;
        dog2.printInfo();

        System.out.println("-------Making Changes-------");
        dog1.name="Bobik";
        dog1.breed="german";

        dog1.printInfo();
        dog2.printInfo();

        //String str="hello";
        //int size=str.length();
        double price=dog1.getPrice();
        System.out.println(price);

        float price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to jump"); //pass a value is called argument
        dog2.love("to play");
    }
}
