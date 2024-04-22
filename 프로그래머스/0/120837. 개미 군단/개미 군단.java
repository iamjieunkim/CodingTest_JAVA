import java.util.Scanner;
class Solution {
    public int solution(int hp) {
        int answer = hp/5;
        hp %= 5;
        
        answer += hp/3;
        hp %= 3;
        
        answer += hp/1;
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T =  new Solution();
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        System.out.println(T.solution(hp));
    }
}