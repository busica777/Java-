package Class27_Maps;

import java.util.LinkedHashMap;


public class MapDemo2_Clear_PutAll {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> beautyProduscts=new LinkedHashMap<>();
        beautyProduscts.put("Foundation",50.5);
        beautyProduscts.put("Blush",20.0);
        beautyProduscts.put("Lipstick",10.5);

        LinkedHashMap<String,Double>cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("conditioner",20.5);
        cosmetics.put("Shampo",20.99);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProduscts);
        System.out.println(grocery);

        grocery.putAll(cosmetics);
        System.out.println(grocery);

        grocery.clear();
        System.out.println(grocery);
    }
}
