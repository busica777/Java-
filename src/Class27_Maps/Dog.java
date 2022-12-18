package Class27_Maps;
public class Dog {
    private String name;
    private String color;
    private String breed;

    public Dog(String name, String color, String breed) {
        setName(name);
        setBreed(breed);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
        ", color='" + color + '\'' +
        ", breed='" + breed + '\'' +
        '}';

        // this is same as  above
        // return name+" " + color + " " + breed;  //we need  to override toString
        //without ovveride to String it will be printing:
        //[class27.Dog@57829d67, class27.Dog@19dfb72a, class27.Dog@17c68925]

    }
}
