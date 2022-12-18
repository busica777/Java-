package Class18_Constructor;

import Class18_Constructor.Animal;

public class HorseConstructor extends Animal {




    public HorseConstructor( String name, String breed, int age, double weight){
        // works pnly if "KEYWORD" is added. The KeyWord is this here
      this.name=name;
      this.breed=breed;
      this.age=age;
      this.weight=weight;
    }
    void printinfo(){
        System.out.println("name"+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }

    public static void main(String[] args) {
        HorseConstructor horsePbject=new HorseConstructor(" Sprit","Stallion",20,400);
        horsePbject.printinfo();
    }
}
