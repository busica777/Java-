package Class26_Collection_Iterator;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        //There are 3 types  of sets
        /*
        1. HashSet:
        -upside-it its  fastest type of Set- when it comes to  inserting and  retrieving
        -downside-it does not care  about the  insertion order
         */
        HashSet<String>hashSet=new HashSet<>();//does  not  maintain the order
        hashSet.add("Mango");
        hashSet.add("Orange");
        hashSet.add("Apple");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet");
        System.out.println(hashSet);


        //2. LinkedHashSet-the order is maintained
        // insertion speed  is  same as HashSet but retrieval is  the  worst
        //Whenever u need insertion order
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();//  maintain the order
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("linkedHashSet");
        System.out.println(linkedHashSet);

        //3.TreeSet-it sorts in alphabetical order
        //Whenever u need sorted data use TreeSet

        TreeSet<String> treeSet=new TreeSet<>(); //does maintain the order
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Mango");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("TreeSet");
        System.out.println(treeSet);

    }
}
