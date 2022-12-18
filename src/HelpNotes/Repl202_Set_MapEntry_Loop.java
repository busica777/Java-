package HelpNotes;
/*
* Create Map in which we want to store keys in Ascending order
Add the below values
1 item = apple
2 item = banana
3 item = pear
4 item = tomato
5 item = mango
6 item: kiwi
Extract all keys and it values and print them in the format below:
**Expected Output:**
Key is 1 item and values is apple
Key is 2 item and values is banana
Key is 3 item and values is pear
Key is 4 item and values is tomato
Key is 5 item and values is mango
Key is 6 item and values is kiwi*/
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Repl202_Set_MapEntry_Loop {
    public static void main(String[]aaaa){
        LinkedHashMap<Integer,String> data=new LinkedHashMap<Integer,String>();
        data.put(1,"apple");
        data.put(2,"banana");
        data.put(3,"pear");
        data.put(4,"tomato");
        data.put(5,"mango");
        data.put(6,"kiwi");

        Set<Map.Entry<Integer,String>> d=data.entrySet();

        for(Map.Entry<Integer,String> fruit:d){


            System.out.println("Key is " +
                    fruit.getKey() +" "+ "item and values is " + fruit.getValue());

        }
    }
}

