import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String str = "";
        String ans = "";
        String answer = "";


        for(int i=0; i<s.length(); i++){
            str = s.substring(0, i) + s.substring(i+1, s.length());
            if(str.indexOf(s.substring(i,i+1))==-1){
               ans += s.substring(i, i+1);
            }
        }

        String[] asort = new String[ans.length()];
        for(int i=0; i<asort.length; i++){
            asort[i] = ans.substring(i,i+1);
        }

        Arrays.sort(asort);

        for (int i=0; i< asort.length; i++){
            answer+= asort[i];
        }
        return answer;
    }
}