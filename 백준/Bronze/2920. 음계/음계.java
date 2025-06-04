import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean asc = true, desc = true;
        
        for (int i = 0; i < 8; i++) {
            if (arr[i] != i + 1) asc = false;
            if (arr[i] != 8 - i) desc = false;
        }
        
        System.out.println(asc ? "ascending" : desc ? "descending" : "mixed");
    }
}