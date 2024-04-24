import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);
        
        return sides[2] < sides[0]+sides[1]? 1 : 2;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] sides = new int[arr.length];
        for(int i=0; i<sides.length; i++){
            sides[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(T.solution(sides));
    }
}