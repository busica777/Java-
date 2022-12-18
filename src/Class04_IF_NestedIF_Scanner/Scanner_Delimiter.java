package Class04_IF_NestedIF_Scanner;

import java.util.Scanner;

public class Scanner_Delimiter {

        public static void main(String[] args) {
            Scanner scan = new Scanner("На голой ветке'" +
                    "Ворон сидит одиноко.'" +
                    "Осенний вечер." +
                    "''***''" +
                    "В небе такая луна,'" +
                    "Словно дерево спилено под корень:'" +
                    "Белеет свежий срез." +
                    "''***''" +
                    "Как разлилась река!'" +
                    "Цапля бредет на коротких ножках,'" +
                    "По колено в воде.");

            scan.useDelimiter("'");

            while (scan.hasNext()) {
                System.out.println(scan.next());
            }

            scan.close();
        }
    }
