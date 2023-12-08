import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int scores[] = new int[n];
        double nscores[] = new double[n];

        double sum = 0;

        for(int i=0; i<scores.length; i++){
            scores[i] = sc.nextInt();
        }

        int max = scores[0];
        int total = 0;

        for (int i=0; i<scores.length; i++){
            if(scores[i]>max){
                max = scores[i];
            }
        }

        for (int i=0; i<scores.length; i++){
            nscores[i]=(double) scores[i]/max*100;
            sum += nscores[i];
        }

        double avg = sum/scores.length;
        System.out.println(avg);
    }

}