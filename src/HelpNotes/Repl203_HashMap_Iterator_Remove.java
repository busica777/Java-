package HelpNotes;
/*Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
Expected Output:
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40*/
import java.util.HashMap;

public class Repl203_HashMap_Iterator_Remove {
    public static void main(String[]aaaa){
        HashMap<String, Integer> map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        map.put("mango", 40);
        map.put("mango", 40);



        var iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            var item=iterator.next();
            System.out.println("Key = "+item.getKey()+" and value = "+item.getValue());

        }

    }
}

