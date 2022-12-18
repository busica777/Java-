package ReviewInstanseLocalStatic;

public class DogInstance {
    String name; //instance variable
    int weight; //instance variable

    static String breed; //static
//when we do not create a constructor ->compiler create a default constructor



    void printInfo() {
        System.out.println("Dog features: " + name + "," + weight + "," + breed);
    }
void love(String thing){
    System.out.println(name+"love"+thing);
}
    //Create a method to calculate price
    // if weight more than 5 pound then the price will be $100
    // if weight is more than 10 pounds than you'll have to pay $300
    //if weight is more than 20 pound then you'll have to pay $1000

    float getPrice() {
        if (weight < 5) {
            return 100;

        }else if(weight<10){
            return 300;
        }else{
            return 1000;
        }
    }
    // create a method that will return bark type
    //if weight is more less than 5 then the noise is LOUD
    //if weight less than 10 then noise is WOOF
    //if weight less than 500 pounds then the noise is GAV GAV



    String bark(){
        String noise;
        if(weight<5){
            noise="loud";
        }else if(weight<10){
            noise="Woof Woof";
        }else{
            noise="Gav GAv";
        }
        return noise;
    }
    /*
     * Variables syntax
     *
     * data type
     *
     *
     *
     * Method syntax
     *
     * returnType name
     * void printInfo
     *
     * */

}
