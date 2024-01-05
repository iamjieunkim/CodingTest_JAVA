import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1 = sc.next();
        String n2 = sc.next();

        String num1 = "";
        String num2 = "";

        for (int i=2; i>=0; i--){
            num1 += n1.charAt(i);
            num2 += n2.charAt(i);
        }

        int ans1 = Integer.parseInt(num1);
        int ans2 = Integer.parseInt(num2);
        
        System.out.println(ans1>ans2?ans1:ans2);
    }
}
