package ReviewInstanseLocalStatic;

public class WineConstructorTest {
    //Write a java class that will have a constructor: one with parameters and second without any parameters.
    // Create a separate Test class where you will execute both of the constructors 1 by 1.
    public static void main(String[] args) {

        WineConstructor b1=new WineConstructor("Sauvignon Blanc","white","low",34.5);
        b1.print();

        WineConstructor b2=new WineConstructor();
    }
}
