package Class03_IF_Else;
/*//3.write a  program and include all days of the week,
    // when there are no more days left, print "Enter a valid number"*/
public class IF_Else_Week {
    public static void main(String[] args) {

        int day=8;
        if(day==1){
            System.out.println("Monday");
        } else if(day==2){
            System.out.println("Tuesday");
        } else if(day==3){
            System.out.println("Wednsday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        } else if(day==6){
            System.out.println("Saturday");
        } else if(day==7){
            System.out.println("Sunday");
        } else{
            System.out.println("Enter a valid number");
        }
    }
}
