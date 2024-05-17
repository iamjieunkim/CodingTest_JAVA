import java.util.Scanner;

class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(0)=='-'){
                String str = s.substring(1,s.length());
                answer = -1*Integer.parseInt(str);
            }else{
                answer = Integer.parseInt(s);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}