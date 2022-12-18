package Class25_Iterator_Collection;

import java.util.ArrayList;

public class Hw2ReplaceLetterWword {
    public static void main(String[] args) {

        //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("lemonade");
        drinks.add("liquor");
        drinks.add("sprite");
        drinks.add("milk");
        drinks.add("juice");

      /* var iterator = drinks.iterator();  //we can use but we don't  need iterator in  this  case,it will be slow
        while (iterator.hasNext()) {
            String drinkName = iterator.next();
            if (drinkName.contains("a") || drinkName.contains("e")) {
                System.out.println("water");
            }else {
                System.out.println(drinkName);
            }
            }*/
        for (int i = 0; i < drinks.size(); i++) { //this  is better way
            if(drinks.get(i).contains("a") || drinks.get(i).contains("e")){
                drinks.set(i,"water"); //set =replace
            }
        }
        System.out.println(drinks);
    }
}

