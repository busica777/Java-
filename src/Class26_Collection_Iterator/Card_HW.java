package Class26_Collection_Iterator;
import java.util.LinkedList;
public abstract class Card_HW {
//Create a Card class that will have implemented  and unimplemented methods and a constructor that will initializes credit card type.
// Create 3 subclasses of a Card card.
// Create 3 objects of different card and store them into LinkedList.
// Using for loop/advanced for loop/ iterator access all methods of the class.
String name;
Card_HW(String name){
    this.name=name;
}
abstract void Swipe();
 void Tap(){
     System.out.println("Tap your card");
 }
}
 class Gas extends Card_HW{
    Gas(String name) {
        super(name);
    }
     @Override
     void Swipe() {
         System.out.println("Please swipe your "+name);
     }
 }
class Grocery extends Card_HW{

    Grocery(String name){
        super(name);
    }
    @Override
    void Swipe() {
        System.out.println("Swipe your "+name+" please");
    }
}
class Repair extends Card_HW{
    Repair(String name){
        super(name);
    }
    @Override
    void Swipe() {
        System.out.println("PLease, swipe your "+name);
    }
}
class Test1{
    public static void main(String[] args) {
        LinkedList<Card_HW> card_hws=new LinkedList<>();
        card_hws.add(new Gas("Apple Card"));
        card_hws.add(new Grocery("Capital One"));
        card_hws.add(new Repair("Home Depot Credit Card"));
        for (Card_HW paycard:card_hws
             ) {
            paycard.Tap();
            paycard.Swipe();
        }
    }
}