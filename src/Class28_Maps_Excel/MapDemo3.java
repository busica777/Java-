package Class28_Maps_Excel;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        Set<String> keys = items.keySet();//keySet method return a Set that contains all the keys of a map
        //Collection <String> keys2=items.keySet();//we can write as well w collection
        for (String key : keys
        ) {
            System.out.println(keys);
        }
        //write ode to print all the values from a map using a loop

        for (Double value: items.values()
             ) {
            System.out.println(value);

        }
    }
}