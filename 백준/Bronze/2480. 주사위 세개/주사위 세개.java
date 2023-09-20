import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int pay=0;

            if(a==b&&b==c){
                pay=10000+a*1000;
                System.out.println(pay);
            }else if(a==b&&a!=c){
                pay = 1000 + a * 100;
                System.out.println(pay);
            }else if(b==c&&a!=b){
                pay = 1000 + b * 100;
                System.out.println(pay);
            }else if(a==c&&c!=b) {
                pay = 1000 + c * 100;
                System.out.println(pay);
            }else{
                if(a>b&&a>c){
                    pay=a*100;
                    System.out.println(pay);
                }else if(b>a&&b>c){
                    pay=b*100;
                    System.out.println(pay);
                }else{
                    pay=c*100;
                    System.out.println(pay);
                }
            }

    }
}