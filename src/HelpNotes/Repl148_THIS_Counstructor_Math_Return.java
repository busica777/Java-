package HelpNotes;

public class Repl148_THIS_Counstructor_Math_Return {
    String item;
    double price;
    int quantity;

    public Repl148_THIS_Counstructor_Math_Return(String item, double price, int quantity){

        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double itemTotalPrice(){
        double totalValue=price*quantity;
        System.out.println(item+" Total Value "+totalValue);
        return totalValue;
    }
}

