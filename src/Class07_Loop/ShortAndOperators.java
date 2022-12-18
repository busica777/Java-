package Class07_Loop;

public class ShortAndOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
        i=i+9;
        System.out.println(i);//19

        i=i-5;
        System.out.println(i);//14

        i=i*2;
        System.out.println(i);//28

        //shorter way to assign a value
        int a=10;
        a+=9;
        System.out.println(a);//19;

        a-=5;
        System.out.println(a);//14

        a=2;System.out.println(a);//28

        a-=10;
        System.out.println(a); //18
        a%=4;
        System.out.println("Value after mod operation=" +a); //2
        a*=10;
        System.out.println(a); //2
        a+=1;
        System.out.println(a);//21

    }

}
