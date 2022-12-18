package Class26_Collection_Iterator;

import java.util.Iterator;
import java.util.TreeSet;

//Create a Set collection in which you need to add names of the countries.
// In this set we want all objects to be sorted in alphabetical order.
// Using 2 different ways retrieve all elements from set.
public class Countries {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("Mongolia");
        countries.add("UAR");
        countries.add("Haiti");
        countries.add("China");
        countries.add("Canada");
        countries.add("England");
        countries.add("Australia");

        System.out.println(countries);

        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}