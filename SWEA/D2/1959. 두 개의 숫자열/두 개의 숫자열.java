import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
         
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N];
            for(int i=0; i<N; i++){
                A[i]=sc.nextInt();
            }
            int[] B = new int[M];
            for(int j=0; j<M; j++){
                B[j]=sc.nextInt();
            }

            int max = 0;
            if(N<M){
                for(int i=0; i<M-N+1; i++){
                    int result = 0;
                    for(int j=0; j<N; j++){
                        result += A[j]*B[i+j];
                    }
                    max = Math.max(max, result);
                }
            } else if (M<N) {
                for(int i=0; i<N-M+1; i++){
                    int result=0;
                    for(int j=0; j<M; j++){
                        result += A[i+j]*B[j];
                    }
                    max = Math.max(max, result);
                }
            } else {
                for(int i=0; i<N; i++){
                    int result = 0;
                    for(int j=0; j<M; j++){
                        result += A[i]*B[j];
                    }
                    max = Math.max(max, result);
                }
            }

            System.out.println("#"+tc+" "+max);
        }
    }
}