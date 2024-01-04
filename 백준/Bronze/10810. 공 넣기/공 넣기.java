import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for (int m = 0; m < M; m++) {
            int start = sc.nextInt(); 
            int end = sc.nextInt();  
            int ballNumber = sc.nextInt(); 

            for (int i = start - 1; i <= end - 1; i++) {
                baskets[i] = ballNumber;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }
}
