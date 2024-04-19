import java.util.Scanner;
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        if(k-n/10>=0){
            answer=12000*n+2000*(k-n/10);
        }
        
        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
    }
}