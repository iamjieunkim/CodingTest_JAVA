import java.util.Scanner;
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.charAt(i);
        }
        
        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String cipher = sc.next();
        int code = sc.nextInt();
        System.out.println(T.solution(cipher, code));
    }
}