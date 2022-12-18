package Class29_Maps_Excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HW_BestBuy_EntrySet {
    public static void main(String[] args) {
        HashMap<Integer,String> items=new HashMap<>();
        items.put(7456832,"PC");
        items.put(6543723,"Mouse");
        items.put(6543458,"Laptop");
        items.put(1457637,"USB-Charger");
        items.put(3546432,"Smartphone");
        items.put(8947835,"Web camera");

        Set<Map.Entry<Integer,String>> entrySet=items.entrySet();

        System.out.println(entrySet);

    }
}
