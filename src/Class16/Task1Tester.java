package Class16;

public class Task1Tester {
    public static void main(String[] args) {
        SyntaxEmployee syntaxEmployee=new SyntaxEmployee();
        syntaxEmployee.empId="123";
        syntaxEmployee.salary=100000;

        SyntaxEmployee.CEO="Asel";
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee mozzamEmp=new SyntaxEmployee();
        mozzamEmp.empId="123";
        mozzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);
    }

}

