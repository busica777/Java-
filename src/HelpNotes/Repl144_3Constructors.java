package HelpNotes;

public class Repl144_3Constructors {

        String lable;
        double price;
        String category;
        boolean hasExpiration;
        int stock;
    Repl144_3Constructors(String lable, double price, String category, boolean hasExpiration, int stock){
            this.lable=lable;
            this.price=price;
            this.category=category;
            this.hasExpiration=hasExpiration;
            this.stock=stock;
        }
    Repl144_3Constructors(String lable, double price, int stock){
            this.lable=lable;
            this.price=price;
            this.stock=stock;
            this.category="misc";
            this.hasExpiration=false;
        }
    Repl144_3Constructors(String lable, double price){
            this.lable=lable;
            this.price=price;
            this.stock=0;
        }
        public void display(){
            System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
        }
    }