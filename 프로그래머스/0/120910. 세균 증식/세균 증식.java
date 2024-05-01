import java.util.Scanner;
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        for(int i=1; i<=t; i++){
            answer=answer*2;
        }
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(T.solution(n, t));
    }
}