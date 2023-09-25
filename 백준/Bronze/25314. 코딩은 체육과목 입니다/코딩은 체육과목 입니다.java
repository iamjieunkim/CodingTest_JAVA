import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            int n = a/4;
            int m = a%4 + 1;

            for (int i=1; i<=n; i++){
                System.out.print("long ");


            }
            for(int j=1; j<=m; j++){
                System.out.print("int ");
            }


    }
}