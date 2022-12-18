package Class24_Collection;

public class Dog {
    private String name;
   private String breed;
   private int age;
    private double weight;

    public Dog(String name, String breed, int age, double weight) {

        setName(name);
        setBreed(breed);
         setAge(age);
       setWeight(weight);

    }
    void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Name cannot has more than 30 letters.Please try again");
        } else if (name.isEmpty()) {
            System.out.println("Name can't be empty. Please try again");
        } else {
            this.name = name;
        }
    }
    void setAge(int age){
        if(age>20){
            System.out.println("Please use less age something seems wrong here");
        } else if(age<0){
            System.out.println("Age can't be negative");
        } else{
            this.age=age;
        }
    }
     void setBreed(String breed) {
         if (breed.length() > 20) {
             System.out.println("Breed cannot has more than 20 letters. Please try again");
         } else if (breed.isEmpty()) {
             System.out.println("Breed cannot be empty. Please try again");
         } else {

             this.breed = breed;
         }
     }
     void setWeight(double weight){
        if(weight<0){
            System.out.println("Negative weight is no allowed");
        } else if(weight>300){
            System.out.println("Please try less than 300 it looks more of an elephant");
        }else{
            this.weight = weight;
        }
     }
     String getName(){
        return name;
     }
     String getBreed(){
        return breed;
     }
     int getAge(){
        return age;
     }
     double getWeight(){
        return weight;
     }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
}
class Test{
    public static void main(String[]aaaa){
        Dog tommy=new Dog("Tommy","German",12,20);

        /*tommy.name="Tommy";
        tommy.breed="German";
        tommy.age=15;
        tommy.weight=20;*/
        System.out.println(tommy.getName());
        System.out.println(tommy.getBreed());
        System.out.println(tommy.getAge());
        System.out.println(tommy.getWeight());
        tommy.printInfo();
    }
}