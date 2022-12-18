package HelpNotes;


    import java.util.*;

class Repl207_Map_Replace_Value {
        public static void main(String[]aaaa){
            HashMap<String,String> map =new HashMap<>();

            map.put("FIVE","EEE");

            map.put("ONE","AAA");

            map.put("FOUR","DDD");

            map.put("TWO","BBB");

            map.put("THREE","CCC");

            System.out.println("HashMap Before Replace :");
            var itr=map.entrySet();
            for(var buc:itr){
                System.out.println(buc.getKey()+" : " +buc.getValue());
            }
            System.out.println("------------------");


            map.replace("FIVE","SUMAIR");
            map.replace("THREE","ASEL") ;

            System.out.println("HashMap After Replace :");
            var itr1=map.entrySet();
            for(var buc:itr1){
                System.out.println(buc.getKey()+" : " +buc.getValue());

            }
        }

    }

