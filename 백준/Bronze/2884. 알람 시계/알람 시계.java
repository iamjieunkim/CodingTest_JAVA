import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(m>=45){
                System.out.printf("%d %d", h, m-45);
            }else if(m<45){
                if(0<h&&h<=23){
                    System.out.printf("%d %d", h-1, m+15);
                }else if(h==0){
                    System.out.printf("23 %d", m+15);
                }
            }

    }
}