import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] b = new String[before.length()];
        String[] a = new String[after.length()];

        for(int i=0; i<before.length(); i++){
            b[i] = before.substring(i, i+1);
            a[i] = after.substring(i, i+1);
        }

        Arrays.sort(b);
        Arrays.sort(a);


        answer = Arrays.equals(a,b)?1:0;
        
        return answer;
    }
}