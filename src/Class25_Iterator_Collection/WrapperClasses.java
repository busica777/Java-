package Class25_Iterator_Collection;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
        //boxing or manual conversion from primitive to wrapper type
        //Integer wrappedNum=Integer.valueOf(num);
        //AutoBoxing or automatic conversion of a primitive to wrapper type
        Integer wrappedNum=num;
        System.out.println(wrappedNum);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        //UNBOXING is converting a wrapper type to a corresponding primitive type
        int num2=wrappedNum.intValue();
    }
}
