class Solution {
    public int[] solution(long n) {
        String arr = Long.toString((long) n);
        int[] ans = new int[arr.length()];
        int[] answer = new int[ans.length];

        for (int i = 0; i < arr.length(); i++) {
            ans[i] = arr.charAt(i) - '0';
        }
        
        for(int i = 0; i < arr.length(); i++) {
            answer[i] = ans[arr.length()-1-i];
        }
        return answer;
    }
}