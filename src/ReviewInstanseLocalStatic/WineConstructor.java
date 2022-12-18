package ReviewInstanseLocalStatic;

public class WineConstructor {
//Write a java class that will have a constructor: one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.
    String name,color,sweetness;
    double price;

    WineConstructor(String title,String ink,String taste,double num){
        name=title;
        color=ink;
        sweetness=taste;
        price=num;

    }
    WineConstructor(){}
void print(){
    System.out.println(name+" is "+color+" wine and have "+sweetness+" sweetness level."+" And the price is "+price);
}

}
