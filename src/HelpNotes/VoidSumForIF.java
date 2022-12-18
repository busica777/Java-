package HelpNotes;

public class VoidSumForIF {
    void sumEvenToX (int x){
        int a;
        int sum=0;
        for( a=1; a<=x;a++ ){
            if (a%2==0){
                sum=sum+a;
            }}
        System.out.println(sum);
    }
    public static void main(String[]aaaa){

        VoidSumForIF blalba=new VoidSumForIF();
        blalba.sumEvenToX(8);
    }}
