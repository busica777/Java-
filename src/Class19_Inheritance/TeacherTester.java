package Class19_Inheritance;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher("Jake ",false," Denver ",13," Math ",25);
   math.printOut();

        PianoTeacher pt=new PianoTeacher("Marta ",true," Aspen ",23,  " positive ");
   pt.printPianoTeacher();

        ChemistryTeacher chem=new ChemistryTeacher("Olga ",true,"Atlanta", 10, 29);
   chem.printChimestry();
    }
}
