package HelpNotes;
/*Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again
**Expected Output:**
5
0
*/
import java.util.HashMap;
public class Repl201_HashMap_Lambda {
    public static void main(String[]aaaa){
        HashMap<String,String> data=new HashMap<>();
        data.put("Street","Patrick ST");
        data.put("Suite","265");
        data.put("City","Vienna");
        data.put("Zip","22180");
        data.put("Country","United State");

        System.out.println(data.size());
        data.keySet().removeIf(s->s==s);
        System.out.println(data.size());
    }
}

