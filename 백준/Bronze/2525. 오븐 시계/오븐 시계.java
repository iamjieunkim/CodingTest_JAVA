import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();

            int min = (h*60)+m1+m2;

            h=(min/60)%24;
            m1=min%60;

            System.out.printf("%d %d", h, m1);

    }
}