package Class26_Collection_Iterator;
    //How can you remove all duplicates from ArrayList?

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
//List<String> aList=new ArrayList<>();
    //aList.add("John");
    //aList.add("Jane");
    //aList.add("James");
    //aList.add("Jasmine");
   //aList.add("Jane");
   //aList.add("James");
public class Remove_Doubles {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        System.out.println(new LinkedHashSet<>(aList));

        HashSet<String>hashSet=new HashSet <>(aList);
        System.out.println(hashSet);

    }

}
