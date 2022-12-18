package Class11_Array;

public class Array2DDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] individualsinRoom1= new String[] {"Sabej", "Shah","Mina"};
String[] individualsinRoom2= new String[] {"Roman","Mina"};
String[] individualsinRoom3= new String[] {"Asad", "Priyasri","Ali"};
// an 2D array that will store 3 single d arrays
String[][]rooms=new String[3][];

rooms [0]=individualsinRoom1;
rooms [1]=individualsinRoom2;
rooms [2]=individualsinRoom3;


System.out.println(rooms[1][1]);

	}

}
