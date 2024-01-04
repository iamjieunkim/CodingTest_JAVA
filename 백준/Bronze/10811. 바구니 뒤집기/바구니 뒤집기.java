import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];

        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int m = 0; m < M; m++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            reverseBaskets(baskets, start - 1, end - 1);
        }


        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }


    private static void reverseBaskets(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
