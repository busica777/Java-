package HelpNotes;
/*Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
**Expected Output:**
265
22180
PATRICK ST
UNITED STATE
VIENNA*/
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Repl205_EntrySet_toUpperCase {
    public static void main(String[]aaaa){
        HashMap<String,String> data=new HashMap<>();
        data.put("Street","Patrick ST");
        data.put("Suite","265");
        data.put("City","Vienna");
        data.put("Zip","22180");
        data.put("Country","United State");

        Set<Map.Entry<String,String>> d=data.entrySet();
        for(Map.Entry<String,String> info:d){
            System.out.println(info.getValue().toUpperCase());
        }

    }
}

