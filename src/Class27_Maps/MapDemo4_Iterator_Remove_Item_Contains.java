package Class27_Maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4_Iterator_Remove_Item_Contains {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);//storing values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        var allKeys = fruit.keySet(); //getting all the keys in the form of a set
        System.out.println(allKeys);

        Iterator<String> iterator = allKeys.iterator();//Getting an iterator on that set
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.contains("n")) {
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}
