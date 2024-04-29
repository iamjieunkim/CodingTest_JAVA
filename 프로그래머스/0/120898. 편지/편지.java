import java.util.Scanner;
class Solution {
    public int solution(String message) {
        int answer = 0;
        
        answer = message.length() * 2;
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        System.out.println(T.solution(message));
    }
}