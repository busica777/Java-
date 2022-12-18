package Class25_Iterator_Collection;

import java.util.ArrayList;

public class ContainsAll {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("eyeLinear");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");

        // System.out.println(beautyProducts.contains("Lipstick"));
       // System.out.println(beautyProducts.contains("Mascara"));
        //System.out.println(beautyProducts.contains("eyeLinear"));

        ArrayList<String> cosmetics = new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        System.out.println(beautyProducts.containsAll(cosmetics));
    }
}
