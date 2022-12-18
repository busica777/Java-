package Class29_Maps_Excel;
/*Create a Map that will store FromClass16.RewievClasses.src.Class21.Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
* */

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class HW_TreeMap {
    public static void main(String[] args) {
Map<String,Integer> emp=new TreeMap<>();
emp.put("Sandy",100000);
emp.put("Jimmy",12000);
emp.put("Greg",110000);
emp.put("Rick",90000);
emp.put("John",132000);
emp.put("Andy",12000);

 int largestValue=(Collections.max(emp.values()));

 for(Map.Entry<String,Integer> entry:
         emp.entrySet()){
     if (entry.getValue()==largestValue){
         System.out.println(entry.getValue());
     }
 }

    }
}
