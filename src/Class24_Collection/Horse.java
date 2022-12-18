package Class24_Collection;

public class Horse {
   private String name;
    private String breed;
    private int age;
    private double weight;
    private double price;

    public Horse(String name, String breed, int age, double weight, double price) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setPrice(price);
    }

    public String getName() {

        return name;
        /* to make available for all except Josh
            public String getBreed(String name) {
            if(name.equals("Josh")){
            return "Not allowed;
            else{
            return name;}
             */
    }

    public void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Name has to be shorter. Please pick another name");
        } else if (name.isEmpty()) {
            System.out.println("Name can't be empty. Please pick a name");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.length() > 25) {
            System.out.println("Breed can't has more than 20 letters. Please check your spellings");
        } else if (breed.isEmpty()) {
            System.out.println("Breed can't be empty. Please pick a breed");
        } else {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 30) {
            System.out.println("Horses don't live more than 30 years. Please check the age again ");
        } else if (age < 0) {
            System.out.println("Age can't be negative. Please check the age again");
        } else {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 700) {
            System.out.println("Too much weight. Please type it correctly");
        } else if (weight < 0) {
            System.out.println("Weight can't be less than 0. Please check your spellings");
        } else {
            this.weight = weight;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 400000) {
            System.out.println("Horse can't be this expensive. Please check the price");
        } else if (price < 0) {
            System.out.println("Price can't be negavite. Check your spellings");
        } else {
            this.price = price;
        }

}
void printinfo1(){
    System.out.println("Name "+name+"Breed "+breed+"Age "+age+"Weight "+weight+"Price "+price);}
}
class Test1{
    public static void main(String[] args) {
        Horse horse=new Horse("Masha","4 Kopyta",10,450,10000.5);
        System.out.println(horse.getName());
        System.out.println(horse.getBreed());
        System.out.println(horse.getAge());
        System.out.println(horse.getWeight());
        System.out.println(horse.getPrice());
    }
}
