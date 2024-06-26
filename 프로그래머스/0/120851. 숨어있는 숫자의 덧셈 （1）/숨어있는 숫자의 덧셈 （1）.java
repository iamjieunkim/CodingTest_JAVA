import java.util.Scanner;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[A-z]", "0");

        for(int i=0; i<my_string.length(); i++){
            answer += Integer.parseInt(my_string.substring(i, i+1));
        }
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        System.out.println(T.solution(my_string));
    }
}