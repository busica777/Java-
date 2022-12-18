package Class26_Collection_Iterator;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers); //we get [10,20,10]

        LinkedHashSet<Integer> setNumbers=new LinkedHashSet<>();
        setNumbers.add(10); //set does not  allow duplication
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers);//we  get  [10,20]
    }
}