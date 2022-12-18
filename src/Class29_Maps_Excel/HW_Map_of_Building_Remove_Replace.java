package Class29_Maps_Excel;

import java.util.HashMap;

/*
* Create a map of a building. Store floor number and it is associated company name.
* (Example: 1= Google, 2=Syntax etc..).
* Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/
public class HW_Map_of_Building_Remove_Replace {
    public static void main(String[] args) {
        HashMap<Integer,String> comp=new HashMap<>();
        comp.put(1,"Google");
        comp.put(2,"Meta");
        comp.put(3,"IBM");
        comp.put(4,"HP");
        comp.put(5,"Samsung");
        comp.put(6, "Facebook");
        comp.put(7,"Bing");

        System.out.println("I have "+comp.size()+" entries");

        //updating company on 4th
        comp.replace(4,"Sony");
        System.out.println("Updated list of companies: "+comp);

        //removing company
        comp.remove(7);
        System.out.println("New list of companies: "+comp);





    }
}
