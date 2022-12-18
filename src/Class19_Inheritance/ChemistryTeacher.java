package Class19_Inheritance;

public class ChemistryTeacher extends TeacherHierarchicalInheritance {
    public int numstudents;

    ChemistryTeacher(String name,boolean funny, String city,int experience, int numstudents){
    super(name,funny,city,experience);
    this.numstudents=numstudents;

}
void printChimestry(){
    System.out.println(name+" teaches chemistry for "+numstudents+" students.");
}}

