import java.util.Scanner;

class Solution {
    public String solution(int num) {
        String answer = "";
        int n = Math.abs(num);
        if(n%2==1){
            answer="Odd";
        } else if (n==0) {
            answer="Even";
        } else{
            answer="Even";
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(T.solution(num));
    }
}