import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int[] answer = new int[10];
        int idx = 0;

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
            answer[i] = arr[i]%42;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (answer[i] == answer[j]) {
                    idx++;
                    break;
                }
            }
        }

        System.out.println(10-idx);
    }
}
