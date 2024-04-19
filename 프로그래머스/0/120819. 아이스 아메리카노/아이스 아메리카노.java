import java.util.*;
class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        answer[0]=money/5500;
        answer[1]=money%5500;
        
        
        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(T.solution(money));
    }
}