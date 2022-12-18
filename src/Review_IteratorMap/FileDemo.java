package Review_IteratorMap;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class FileDemo {
    public static void main(String[] args) throws IOException {
//we want tp have a method that can help us read data from properties file
        // this method should be available to any other class in project and once we pass
        // key it should give us its value
        System.out.println(getProperty("password"));
    }
    public static String getProperty(String key) throws IOException {

        String path="Data/config.properties";

        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis); //specifying the file to work with
        return properties.getProperty(key);
    }
}
