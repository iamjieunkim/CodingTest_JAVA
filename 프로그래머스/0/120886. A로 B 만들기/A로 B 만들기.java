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

        String na = "";
        String nb = "";

        for(int j=0; j<a.length; j++){
            na += a[j];
            nb += b[j];
        }

        answer = na.equals(nb)?1:0;
        
        return answer;
    }
}