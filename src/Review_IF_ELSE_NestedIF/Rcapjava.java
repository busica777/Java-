package Review_IF_ELSE_NestedIF;

public class Rcapjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello");

//explicit/narrowing/Manual
//As we can't fit 129 in byte we'll get wrong results
short largerBox=127;
byte smallerBox=(byte) largerBox;
System.out.println(smallerBox);

//As we can fit 129 in byte we'll get proper results
int largerBox1=129;
short smallerBox2=(byte) largerBox1;
System.out.println(largerBox1);

//Implicit/widening/Automatic
short smallerBox3=45;
long largerBox3=smallerBox3;
System.out.println(largerBox3);
	}

}
