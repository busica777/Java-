package Class25_Iterator_Collection;

import java.util.ArrayList;

public class HW1 {

        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */
        public static void main(String[] args) {
            ArrayList<String> words= new ArrayList<>();
            words.add("batterie");
            words.add("freeze");
            words.add("liscence");
            words.add("pencil");
            words.add("puzzle");
            words.add("book");


            //Removing every word that ends with “e”
            var iterator=words.iterator();
            while(iterator.hasNext()){
                String item= iterator.next();
                if(item.endsWith("e")){
                    iterator.remove();
                }
            }
            System.out.println(words);

        }
    }

