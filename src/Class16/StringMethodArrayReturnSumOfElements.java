package Class16;
//Create a method that will accept an array as parameters and will return a sum of all elements from that array.
//    Method should be visibly only within same package and accessible by the creating an instance of the class.
public class StringMethodArrayReturnSumOfElements {
    double sumArray(int []arr){
double sum=0;

        for (int num:arr
             ) {
            sum+=num;
        }
        return sum;
    }

}
