import java.util.Scanner;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int alp[] = new int[26];

        for (int i=0; i<26; i++){
            alp[i] = -1;
        }

        for (int i=0; i<S.length(); i++){
            int s = (int)(S.charAt(i))-97;
            
            if (alp[s] == -1) {
                alp[s] += i + 1;
            }
        }

        for (int i=0; i<26; i++){
            System.out.print(alp[i]+" ");
        }
    }
}
