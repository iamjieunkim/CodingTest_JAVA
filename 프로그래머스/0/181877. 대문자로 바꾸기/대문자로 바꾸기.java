import java.util.Scanner;
class Solution {
    public String solution(String myString) {
        String answer = myString.toUpperCase();
        return answer;
    }
    
    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String myString = sc.next();
        System.out.print(T.solution(myString));
    }
    
}