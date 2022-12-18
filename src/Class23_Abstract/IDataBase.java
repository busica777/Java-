package Class23_Abstract;

public interface IDataBase {
    int age=10;
     void openDataBase();
      void readData();
      void writeData();

}
class IBM implements IDataBase{

    @Override
    public void openDataBase() {
        System.out.println("Opening the IBM DataBase");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Data");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the DataBase");
    }
}