import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            if(i%2==0) answer += i;
        }
        return answer;
    }
    public static void main(String args[]){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.solution(n));
    }
}