package Review3_Constructor_Access_Modifier;

public class School {
    public static void main(String[]args) {
        Teacher t=new Teacher("John","Smith");
        System.out.println(t.name);
        System.out.println(t.lname);

        Teacher t1=new Teacher("Jane","Smith","Biology");
        t1.teach();

        Teacher t2=new Teacher("Jack","Smith",5);

        Teacher.school="Syntax";
        Teacher.work();
        t2.print(); //protected
        t2.teach(); //default
        // t2.getBonus();-because its private, method is not visible


        /*variable syntax
         * OPTIONAL              OPTIONAL                MUST       MUST
         * access Modifier     non access modifier     dataType   name
         * public                 static                 String      breed;
         *
         * method syntax
         * OPTIONAL             OPTIONAL                 MUST           MUST
         * accessModifier    non access modifier         returnType     name
         * public                static                  void            printInfo
         */
    }
}