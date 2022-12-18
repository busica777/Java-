package HelpNotes;

public class Repl141_EnhacedFor_Array_Method {
    public static int maxValue(int[]arr){
        int max=0;
        for(int n:arr){
            if(n>max){
                max=n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }}