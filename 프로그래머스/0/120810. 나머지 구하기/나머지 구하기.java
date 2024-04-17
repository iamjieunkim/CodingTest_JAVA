import java.util.Scanner;

class Solution {

    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1%num2;
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print(T.solution(num1, num2));
    }
}