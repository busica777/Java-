package Review9;

public class Banana extends Fruit {
String origin;
    Banana(String name,String shape,String color,String origin){
        super(name, shape, color);
        this.origin=origin;
    }
    void makeSmothie(){
        System.out.println("from "+name+" we get tasty smothie");
    }
    void makePie(){
        System.out.println("Banana pie is delicious");
    }
    /*
     * when child class have same method as super class-
     * overriding - 2 methods with same BUT inside Different classes
     *
     * how to override:
     * 1. method signature MUST be same
     * 2. return MUST BE SAME
     * 3.access modifier/visibility MUST be same or MUST be higher
     * */

   protected void grow(){ //protected or public
       System.out.println(name+" grows fast and ready to eat");
    }
    //when child class have same static method as parent class
    //we're not achieving overriding
    //this calls method hiding
    public static void havePeel(){
        System.out.println(" banana is very easy to peel");
    }
    public static void main(String[] args) {
        Banana ban=new Banana("banana", "banana shape", "yellow", "Ecuador");

        ban.haveBenefits();//comes from fruit
        ban.makeSmothie();//comes from banana
        ban.grow(); //comes from fruit
        Banana.havePeel();//comes from banana

        System.out.println("            --------------------------------           ");
        //runtime polymorphism
        //Java  makes  a decision based  on object-Banana
       Fruit fruit=new Banana("banana","banana shape","green"," Africa");
    fruit.grow();
    fruit.haveBenefits();

    fruit.havePeel(); //not overriding/polymorphism. executes from parent class

   }

}
