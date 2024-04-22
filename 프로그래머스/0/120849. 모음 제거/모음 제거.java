import java.util.Scanner;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.replace("a", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("o", "");
        answer = my_string.replace("u", "");
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        System.out.println(T.solution(my_string));
    }
}