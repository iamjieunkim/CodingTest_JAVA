class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String ans = "";
        
        ans = my_string.substring(s,e+1);
        
        for(int i=ans.length()-1; i>=0; i-- ){
            answer += ans.charAt(i);
        }

        answer  = my_string.substring(0,s).concat(answer);
        answer  = answer.concat(my_string.substring(e+1));
        
        return answer;
    }
}