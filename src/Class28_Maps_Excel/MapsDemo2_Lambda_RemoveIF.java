package Class28_Maps_Excel;


    import java.util.HashMap;

    public class MapsDemo2_Lambda_RemoveIF {
        public static void main(String[] args) {
            HashMap<String,Double> items=new HashMap<>();
            items.put("Iphone 14",1000.0);
            items.put("Eggs",2.40);
            items.put("Apples",5.0);
            items.put("Keyboard",100.0);
            items.put("Flower",1.0);

            items.keySet().removeIf(name-> name.contains("e"));
            System.out.println(items);
        }
    }

