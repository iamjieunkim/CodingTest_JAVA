import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String max = Long.toString(n);
        int arr[] = new int[max.length()];
        for (int i = 0; i < max.length(); i++) {
            arr[i] = max.charAt(i) - '0';
        }

        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            answer+= (arr[i] * Math.pow(10, i));
        }
        return answer;
    }
}