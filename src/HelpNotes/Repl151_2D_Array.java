package HelpNotes;

public class Repl151_2D_Array {
    public int sumArr(int[][] a){

        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                sum+=(a[i][j]);
            }
        }
        System.out.println(sum);
        return sum;
    }
}

