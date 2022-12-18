package Class28_Maps_Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;

public class ExelDemo1 {
    public static void main(String[] args) throws IOException {
        //we need to know the path of the file
        String path="Data/Salary.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);

 Sheet sheet=excelFile.getSheet("Sheet1");
   Row row0= sheet.getRow(0);
        System.out.println(row0.getCell(0));

        Row row1=sheet.getRow(1);
        System.out.println(row1.getCell(1));
    }
}
