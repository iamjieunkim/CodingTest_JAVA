import java.util.Scanner;

class Solution {
    public int solution(int angle) {
        int answer = 0;

        if(0<angle&&angle<90){
            answer=1;
        }else if(angle==90){
            answer=2;
        }else if(angle<180){
            answer=3;
        }else if(angle==180){
            answer=4;
        }
        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        System.out.print(T.solution(angle));
    }
}