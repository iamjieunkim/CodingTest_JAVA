import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];
        String[] answer = new String[N];

        for (int i=0; i<N; i++){
            arr[i] = sc.next();
            answer[i] = (arr[i].charAt(0))+""+arr[i].charAt(arr[i].length()-1);
        }

        for(int i=0; i<N; i++) {
            System.out.println(answer[i]);
        }

    }
}
