package Class26_Collection_Iterator;

import java.util.LinkedList;

public class ArrayListVsLinkedList {
    //DON'T RUN  THIS CODE IT  CAN  CRUSH THE COMPUTER(AT LEAST 8 GB?)
    public static void main(String[] args) {

        //LinkedList is faster-it will  take 74 mili sec

       LinkedList<String> linkedList=new LinkedList<>();
        long  startTime=System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            linkedList.add(0,"Test");
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);

       /* //ArrayList-slow-it will take 49461 mili sec

        ArrayList<String> arrayList=new ArrayList<>();
        long  startTimeA=System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            arrayList.add(0,"Test");
        }
        long endTimeA=System.currentTimeMillis();
        System.out.println("ArrayList"+(endTimeA-startTimeA));
    }
}*/

    }}