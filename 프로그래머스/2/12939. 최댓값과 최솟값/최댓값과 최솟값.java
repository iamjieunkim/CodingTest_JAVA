import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] charr = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            charr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(charr);

        answer += charr[0];
        answer += " ";
        answer += charr[charr.length-1];
        
        return answer;
    }
}