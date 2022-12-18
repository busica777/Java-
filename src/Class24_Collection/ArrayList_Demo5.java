package Class24_Collection;

import java.util.ArrayList;

public class ArrayList_Demo5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        //use ADD method to insert elements in an ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        System.out.println(colors);

        //deleting specific element BLUE

        colors.remove("Blue");
        System.out.println(colors);
        //deleting by using INDEX
        colors.remove(2);
        System.out.println(colors);
    }
}