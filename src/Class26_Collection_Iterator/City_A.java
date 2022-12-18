package Class26_Collection_Iterator;

import java.util.TreeSet;



//Create a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
public class City_A {
    public static void main(String[] args) {
        TreeSet<String> cities=new TreeSet<>();
        cities.add("Houston");
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Pittsburgh");
        cities.add("Tampa");
        cities.add("Austin");

        System.out.println(cities);


        var iterator=cities.iterator();
        while(iterator.hasNext()){
            String item= iterator.next();
            if(item.startsWith("A")){
            iterator.remove();
            }
        }
        System.out.println(cities);
    }


}
