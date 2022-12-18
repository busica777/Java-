package Class23_Abstract;

public class Data_Base_Tester {
    public static void main(String[] args) {
        Data_Base dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
