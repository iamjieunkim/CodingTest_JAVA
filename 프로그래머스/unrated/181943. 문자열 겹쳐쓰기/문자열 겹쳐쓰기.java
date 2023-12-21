class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        

            
        String str1 = my_string.substring(0,s);
        String str2 = my_string.substring(s+overwrite_string.length(),my_string.length());

        String ans = str1.concat(overwrite_string);
        String answer = ans.concat(str2);
        
        return answer;
    }
}