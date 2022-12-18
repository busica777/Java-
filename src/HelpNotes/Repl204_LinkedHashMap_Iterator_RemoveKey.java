package HelpNotes;
/*Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Expected output:**
Patrick ST
265
Vienna
22180
United State*/
import java.util.LinkedHashMap;
public class Repl204_LinkedHashMap_Iterator_RemoveKey {
    public static void main(String[]aaaa){
        LinkedHashMap<String,String> data=new LinkedHashMap<>();
        data.put("Street","Patrick ST");
        data.put("Suite","265");
        data.put("City","Vienna");
        data.put("Zip","22180");
        data.put("Country","United State");

        var iterator=data.entrySet().iterator();
        while(iterator.hasNext()){

            var d=iterator.next();

            System.out.println(d.getValue());
        }
    }
}

