package Class27_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5_Iterator_While_Lambda {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);//storing values in a map
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);



        Collection<Double>values=fruit.values();//returns all the values from a map

        Iterator<Double> iterator= values.iterator();
        while (iterator.hasNext()){
            Double value = iterator.next();
            if(value>2 ){
                iterator.remove();
            }
        }
        System.out.println(fruit);
        fruit.values().removeIf(x->x>2); //same results as code from line 15 to 23
        System.out.println(fruit);

        fruit.keySet().removeIf(x->x.contains("n"));
        System.out.println(fruit);
    }
}