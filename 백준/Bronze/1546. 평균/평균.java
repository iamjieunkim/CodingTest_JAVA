import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = new int[N];

        for (int i=0; i<N; i++){
            scores[i] = sc.nextInt();
        }

        int max = scores[0];

        for (int i=0; i<N; i++){
            if (max < scores[i]){
                max = scores[i];
            }
        }

        double[] nscores = new double[N];
        double sum = 0;

        for (int i=0; i<N; i++){
            nscores[i] = (double) scores[i]/max*100;
            sum += nscores[i];
        }

        System.out.println((double) sum/N);

    }
}
