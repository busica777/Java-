package Class19_Inheritance;

public class MathTeacher extends TeacherHierarchicalInheritance{
    String classtype;
    int numstudents;

    MathTeacher(String name,boolean funny, String city,int experience,String classtype, int numstudents ){
        super(name,funny,city,experience);
        this.classtype=classtype;
        this.numstudents=numstudents;
    }
    void printOut(){
        System.out.println(name+"teaches"+classtype+"for "+numstudents+" students.");
    }

}
