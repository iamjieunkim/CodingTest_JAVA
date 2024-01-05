import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String numbers = sc.next();
        int sum = 0;

        for (int i=0; i<N; i++){
            sum += Integer.parseInt(String.valueOf(numbers.charAt(i)));
        }

        System.out.println(sum);

    }
}
