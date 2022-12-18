package Class18_Constructor;

import Class18_Constructor.Animal;

public class DogCostructor extends Animal {
   ;

    String color;


    double height;

    public DogCostructor(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }

    public DogCostructor(String name, String breed, String color, int age, double weight, double height) {
        /*this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.height = height;*/

        this(name, breed, color, age, weight);
        this.height = height;

    }
}