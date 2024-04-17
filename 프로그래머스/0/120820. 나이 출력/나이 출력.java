import java.util.Scanner;

class Solution {

    public int solution(int age) {
        int answer = 0;
        answer = 2023-age;
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print(T.solution(age));
    }
}