import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr = sc.nextLine();
        arr=arr.trim();
        int idx = 0;

        for(int i=0; i<arr.length(); i++){
            if(' '==arr.charAt(i)){
                idx++;
            }
        }

        if(arr.isEmpty()==true){
            System.out.print(0);
        }else{
            System.out.print(idx+1);
        }

    }
}
