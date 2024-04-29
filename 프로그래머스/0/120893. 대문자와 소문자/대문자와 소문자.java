import java.util.Scanner;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++){
            if((int)my_string.charAt(i)>=65&&(int)my_string.charAt(i)<91){
                answer += (char)(((int)my_string.charAt(i)+32));
            }else if ((int)my_string.charAt(i)>=97&&(int)my_string.charAt(i)<123){
                answer += (char)(((int)my_string.charAt(i)-32));
            }
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