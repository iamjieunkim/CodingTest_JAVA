import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c=0;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int a=sc.nextInt();

        for(int i=0;i<n;i++){
            if(arr[i]==a){
                c++;
            }
        }
        System.out.println(c);


    }
}