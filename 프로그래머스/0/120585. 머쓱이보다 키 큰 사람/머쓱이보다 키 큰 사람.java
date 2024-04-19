import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;


        for(int i=0; i<array.length; i++){
            if(array[i]>height){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] array = new int[arr.length];
        for(int i=0; i< array.length; i++){
            array[i] = Integer.parseInt(arr[i]);
        }
        int height = sc.nextInt();

        System.out.println(T.solution(array, height));
    }
}