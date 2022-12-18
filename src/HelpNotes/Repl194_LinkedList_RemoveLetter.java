package HelpNotes;

import java.util.List;
import java.util.LinkedList;

public class Repl194_LinkedList_RemoveLetter {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        var iterator=countries.iterator();
        while(iterator.hasNext()){
            String  it=iterator.next();
            if(it.startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(countries);
    }
}

