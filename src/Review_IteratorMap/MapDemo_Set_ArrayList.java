package Review_IteratorMap;


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo_Set_ArrayList {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 5.0);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);
        // Set<String> keys = getKeys(items);
        ArrayList<String> keys = getKeys(items);
        for (var key : keys) {
            System.out.println(key);
        }
        List<Double> vaqlues=getValues(items);
    }
    /* public static Set<String> getKeys(Map<String,Double>map){ //how we create a method
      //when we call a method  we call an  object  of class or  made  them  static
         //Set<String>-output
         //(Map<String,Double>map)-parameter;input
         //static-we dont need to create an instance
       //  return map.keySet();
       /*public static Set<String> getKeys(Map<String,Double> map){

        return map.keySet();
    } */
    public static ArrayList<String> getKeys(Map<String,Double> anyname) {

        return new ArrayList<>(anyname.keySet());
    }
    //return all the values from the Map in the form of ArrayList
    //map-just a variable name
    public  static List<Double> getValues(Map<String,Double>any) {
        return new ArrayList<>(any.values());




    }
}

