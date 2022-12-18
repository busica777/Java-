package HelpNotes;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Repl206_Map_EntrySet_Remove {


        public static void main(String[]aaaa){
            HashMap<String,String> map =new HashMap<>();

            map.put("ONE","AAA");

            map.put("TWO","BBB");

            map.put("THREE","CCC");

            map.put("FOUR","DDD");

            map.put("FIVE","EEE");

            System.out.println("HashMap Before Remove :");
            var itr=map.entrySet();
            for(var buc:itr){
                System.out.println(buc.getKey()+" : " +buc.getValue());
            }
            System.out.println("------------------");

            for(Iterator<Map.Entry<String,String>>m=map.entrySet().iterator(); m.hasNext();){
                Map.Entry<String,String> entry=m.next();
                if(entry.getValue().equals("AAA") || entry.getValue().equals("DDD")){
                    m.remove();
                }
            }

            System.out.println("HashMap After Remove :");
            var itr1=map.entrySet();
            for(var buc1:itr1){
                System.out.println(buc1.getKey()+" : "+buc1.getValue());
            }

        }
    }


