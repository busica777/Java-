package Class29_Maps_Excel;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*Create a map of countries with its capital that will store countries in alphabetical order.
* Print all keys and values from a country map using for each loop and iterator.
* Print all values from a country map using for each loop and iterator*/
public class HW_Map_of_Countries_LOOP_ITERATOR {
    public static void main(String[] args) {
        Map<String,String> cont=new TreeMap<>();
        cont.put("Japan","Tokyo");
        cont.put("China","Bejing");
        cont.put("Vietnam","Hanoi");
        cont.put("Thailand","Bangkok");
        cont.put("Canada","Ottawa");
        cont.put("Indonesia","Jakarta");

        //Using FOR LOOP
        for ( Map.Entry<String,String> entry:cont.entrySet())
            System.out.println("Key: "+entry.getKey()+", Value: "+entry.getValue());
        System.out.println("***************************");

        //Using ITERATOR
        Iterator<Map.Entry<String,String>> itr=cont.entrySet().iterator();
        while(itr.hasNext()) {
           Map.Entry<String,String> entry= itr.next();
            System.out.println("Keys and Values by Iterator: " + entry.getKey()+" - "+entry.getValue());

        }
        System.out.println("-----------------------------");

        Iterator<String> itr1=cont.values().iterator();
                while(itr1.hasNext()){
                String value=itr1.next();
                    System.out.println("Values by Iterator: "+value);
                }
        System.out.println("++++++++++++++++++++++++++++");

        for ( Map.Entry<String,String> entry1:cont.entrySet())
            System.out.println("Value by for loop: "+entry1.getValue());
        }
    }

