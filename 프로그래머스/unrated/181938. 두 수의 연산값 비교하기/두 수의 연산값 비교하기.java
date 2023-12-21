class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
         String ans = Integer.toString(a)+Integer.toString(b);
        int ans1 = Integer.parseInt(ans);
        int ans2 = 2*a*b;

        answer = ans1>=ans2 ? ans1 : ans2;
        
        return answer;
    }
}