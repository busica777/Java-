package Class28_Maps_Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*right click on your file and click copypath reference the click from content root
        * */
        var path="Data/config.properties";
        var fileInputStream=new FileInputStream(path); //it hepls to navigate to file
        var properties=new Properties();
        properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URl"));
        System.out.println("password");
        fileInputStream.close();//closing the file

    }
}
