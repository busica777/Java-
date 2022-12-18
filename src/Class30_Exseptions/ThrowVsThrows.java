package Class30_Exseptions;



import Utils.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {
    public static void main(String[] args) throws IOException {

        method2();
    }

    public static void method1() throws IOException {
        System.out.println(ExcelReader.read("Data/Salary.xlsx"));
    }
    public static void method2() throws IOException { //if we  don't write try/catch in method1  and add exception
        method1();                //then the error will go to method2  because method1 it is called
        //then we need to write try,catch  in  method2
    }
}
