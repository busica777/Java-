package Class29_Maps_Excel;

import Utils.ExcelReader;

import java.io.IOException;

public class Review1 {
    public static void main(String[] args) throws IOException {


        /*
         * we wanted to read data from files*/
        String path = "Data/Salary.xlsx";
        var data=ExcelReader.read(path);

        /*Map<String,String> row1=data.get(0);
        System.out.println(row1.get("Name"));*/


      /*  for (var row:data
             ) {
            System.out.println(row);
        }*/
        System.out.println(data);
    }
}