package Class18_Constructor;

import Class18_Constructor.Animal;

public class CatConstructor extends Animal {
    //create fields



    public CatConstructor(String catName, String catBreed){
        name=catName;
        breed=catBreed;
    }
    public void printInfo(){
        System.out.println("Name "+name+" Breed"+breed+" age"+age+" Weight"+weight);
    }
    //public static void main(String[] args) {
        //create object--anyone can  assign value w this type, to avoid  make fields private so noone access my fields
       // CatConstructor catObject=new CatConstructor();
        //catObject.name="Laila majno";
        //catObject.breed="Persian";
       // catObject.age=5;
        //catObject.weight=5;

        //System.out.println(" Cat is gone");

        public CatConstructor(String catName, String catBreed, int catAge, double catWeight) {
            name = catName;
            breed = catBreed;
            age = catAge;
            weight = catWeight;
        }

}





