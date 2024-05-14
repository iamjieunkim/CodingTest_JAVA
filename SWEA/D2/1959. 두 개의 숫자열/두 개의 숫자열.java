import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
             
            int[] A = new int[N];
            int[] B = new int[M];
             
            for(int i = 0; i < N; i++) A[i] = sc.nextInt();
            for(int i = 0; i < M; i++) B[i] = sc.nextInt();
             
            int max = 0;
             
            if(N < M) {
                for(int i = 0; i < M-N+1; i++) {
                    int result = 0;
                    for(int j = 0; j < N; j++) {
                        result += A[j]*B[i+j];
                    }
                    max = Math.max(max, result);
                }
            } else if (N > M) {
                for(int i = 0; i < N-M+1; i++) {
                    int result = 0;
                    for(int j = 0; j < M; j++) {
                        result += A[i+j]*B[j];
                    }
                    max = Math.max(max, result);
                }
            } else {
                int result = 0;
                for(int i = 0; i < N; i++) {
                    result += A[i]*B[i];
                }
                max = Math.max(max, result);
            }
            System.out.printf("#%d %d\n", test_case, max);
        }
    }
}