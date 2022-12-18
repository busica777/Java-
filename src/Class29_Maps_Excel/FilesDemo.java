package Class29_Maps_Excel;
import Utils.ConfigReader;
import Utils.ExcelReader;


import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path="Data/Salary.xlsx";
        var properties=  ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));


        String excelPath="Data/Salary.xlsx";
        var excelData=  ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}