package Class22_;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class Task2 {
}
 class CreditCard{
    double balance;
    double interest;
CreditCard(double balance, double interest){
    this.balance=balance;
    this.interest=interest;
}
    void calculateInterest(){
        double InterestAmount=interest*balance/100;
        System.out.println("Interest Amount "+InterestAmount);
    }
 }
 class Visa extends CreditCard{
Visa(double balance, double interest){
    super(balance,interest); //calling constructor from the parent lass
}

@Override
     void calculateInterest(){
    double InterestAmount=interest*balance/100;
    System.out.println();
    System.out.println("Interest Amount "+(InterestAmount+5));
}

     class AX extends CreditCard {
         AX(double balance, double interest) {
             super(balance, interest); //calling constructor from the parent lass
         }

         @Override
         void calculateInterest() {
             double InterestAmount = interest * balance / 100;
             System.out.println();
             System.out.println("Interest Amount " + (InterestAmount + 10));
         }
     }}