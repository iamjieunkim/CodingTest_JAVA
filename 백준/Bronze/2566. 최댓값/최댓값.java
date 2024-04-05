import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        int[][] arr = new int[9][9];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];
        int a = 0; int b=0;
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    a = i+1;
                    b = j+1;
                }else if(max==0){
                    a=1;
                    b=1;
                }
            }
        }

        System.out.println(max);
        System.out.printf("%d %d", a, b);
    }

}
