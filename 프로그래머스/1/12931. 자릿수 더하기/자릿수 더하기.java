import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i=0; i<str.length(); i++){
            answer += Integer.parseInt(str.substring(i,i+1));
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}