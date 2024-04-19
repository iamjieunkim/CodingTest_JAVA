import java.util.Scanner;
public class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] charArray = my_string.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            answer += charArray[i];
        }

        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        System.out.println(T.solution(my_string));
    }
}
