package HelpNotes;

import java.util.HashSet;
/*Create a set collection in which you do not want to preserve or sort the order and add below values to it.
Red
Pink
Yellow
White
Black
Print set collection
And get total number of colors available in the set
**Expected Output:**
Original Hash Set: [Red, Pink, White, Yellow, Black]
Size of the Hash Set: 5*/
public class Repl197_HashSet_size{

    public static void main(String[]aaaa){
        HashSet<String> hashs=new HashSet<>();
        hashs.add("Red");
        hashs.add("Pink");
        hashs.add("Yellow");
        hashs.add("White");
        hashs.add("Black");

        System.out.println("Original Hash Set: "+hashs);
        System.out.println("Size of the Hash Set: "+hashs.size());


    }

}
