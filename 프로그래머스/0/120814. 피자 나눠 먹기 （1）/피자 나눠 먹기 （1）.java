import java.util.Scanner;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n<7){
            answer=1;
        }else if(n%7==0){
            answer=n/7;
        }else{
            answer=n/7+1;
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