import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int baskets[] = new int[N];

        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for(int i=0; i<M; i++){
            int ball1 = sc.nextInt();
            int ball2 = sc.nextInt();

            int temp = baskets[ball1 - 1];
            baskets[ball1 - 1] = baskets[ball2 - 1];
            baskets[ball2 - 1] = temp;
        }

        for(int i=0; i<N; i++){
            System.out.print(baskets[i]+ " ");
        }
    }
}
