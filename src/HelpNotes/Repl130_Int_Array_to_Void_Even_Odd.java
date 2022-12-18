package HelpNotes;

public class Repl130_Int_Array_to_Void_Even_Odd {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{
        int e;
        for(int i=0;i<array.length; i++){

            if(array[i]%2==0){

                e=array[i]/2;

                System.out.print(e+" ");

            }else{
                e=array[i]*10;

                System.out.print(e+" ");
            }

        }
    }}