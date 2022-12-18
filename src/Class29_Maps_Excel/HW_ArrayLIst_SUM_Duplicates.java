package Class29_Maps_Excel;

import java.util.ArrayList;

public class HW_ArrayLIst_SUM_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(23);
        num.add(12);
        num.add(43);
        num.add(39);
        num.add(9);
        num.add(12);
        num.add(39);

        int sum = 0;
        /*for(int i = 0; i < num.size(); i++)
        {
            sum = sum + num.get(i);
        }
        System.out.println(sum);*/


        for (int number : num){
            sum += number;
        }

        System.out.println(sum);
    }
    }

