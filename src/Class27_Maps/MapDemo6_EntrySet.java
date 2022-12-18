package Class27_Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo6_EntrySet {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);//storing values in a map
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        Set<Map.Entry<String, Double>> entrySet = fruit.entrySet();

        Iterator<Map.Entry<String, Double>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            var item=iterator.next();
            System.out.println(fruit);
        }
    }
}