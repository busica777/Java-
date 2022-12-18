package Class25_Iterator_Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("Shampoo");
        beautyProducts.add("Lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("eyeLinear");

        Iterator<String>iterator=beautyProducts.iterator();
        while(iterator.hasNext()){
            String item=iterator.next(); //better approach
            if(item.endsWith("r")){
                //if(iterator.next().endsWith("r")){ =same as above
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }
}
