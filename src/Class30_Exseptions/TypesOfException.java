package Class30_Exseptions;

import Utils.ExcelReader;

public class TypesOfException {

        public static void main(String[] args) {

            String name = null;
            if(name != null)
            {
                System.out.println(name.length());
            }

            int[] arr = new int[5];
            int index = 10;
            try {
                System.out.println(arr[index]);
            }
            catch (Exception e) {
                System.out.println("Josh please fix your issues you never write good code");
            }
            if(index < arr.length)
            {
                System.out.println(arr[index]);
            }

            try {
                System.out.println(ExcelReader.read("Data/Salary.xlsx"));
            }
            catch (NullPointerException e) {

            }
            catch (Exception e) {
                System.out.println("Josh can you please stop deleting my files");
            }


            System.out.println("Important line of code");
        }}