import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] ans = new String[my_string.length()];

        my_string = my_string.toLowerCase();

        for(int i=0; i<ans.length; i++){
            ans[i] = my_string.substring(i, i+1);
        }

        Arrays.sort(ans);

        for(int i=0; i< ans.length; i++){
            answer += ans[i];
        }
        return answer;
    }
}