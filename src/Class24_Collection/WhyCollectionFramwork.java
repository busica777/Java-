package Class24_Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionFramwork {
    public static void main(String[] args) {

        //if we store single values we use variables

        String name="Josh";
        String name2="Joe";
        System.out.println(name);
        System.out.println(name2);

//if we have to store more than 2 values of same kind

        String [] names={"Reshad","Adam","Again Josh"};

        // fixed size
        String [] breeds=new String[10];
        breeds[0]="Bulldogs";
        System.out.println(Arrays.toString(breeds));

        ArrayList<String > colors=new ArrayList<>();
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);
    }
}
