package HelpNotes;
/*Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
**Expected Output:**
Patrick ST
265
Vienna
22180
United State*/
import java.util.HashMap;
public class Repl200_Maps_print_Half {
    public static void main(String[]aaaa){
        HashMap<String,String> data=new HashMap<>();
        data.put("Street","Patrick ST");
        data.put("Suite","265");
        data.put("City","Vienna");
        data.put("Zip","22180");
        data.put("Country","United State");

        System.out.println(data.get("Street"));

        System.out.println(data.get("Suite"));
        System.out.println(data.get("City"));
        System.out.println(data.get("Zip"));
        System.out.println(data.get("Country"));

    }
}
