package HelpNotes;

public class Repl143_4Constructors {

        String make;
        String model;
        int numberOfDoors;
        int topSpeed;
        double price;
        //1st
        public Repl143_4Constructors(String make, String model, int numberOfDoors, int topSpeed, double price ){
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;

        }
        //2nd
        public Repl143_4Constructors(String make,String model, int topSpeed, double price ){
            this.make=make;
            this.model=model;
            this.topSpeed=topSpeed;
            this.price=price;


        }
        //3rd
        public Repl143_4Constructors(int numberOfDoors, int topSpeed, double price){

            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;
        }
        //4th
        public Repl143_4Constructors(String make, String model, int numberOfDoors){
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;

        }
        public void display(){
            System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
        }
    }
