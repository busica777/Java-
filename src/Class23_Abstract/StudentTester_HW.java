package Class23_Abstract;

public class StudentTester_HW {
    public static void main(String[] args) {
        StudentHW[] arr={new CollegeStudentHW(), new SchoolStudentHW(), new SyntaxStudentHW()};

        for (StudentHW st:arr
             ) {
           st.study();
           st.doHomeWork();
           st.doPractice();
        }
    }
}
