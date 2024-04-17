import java.util.Scanner;

class Solution {
    public String solution(String my_string, String letter) {
        String answer="";

        answer = my_string.replaceAll(letter, "");

        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.print(T.solution(str1,str2));
    }
}