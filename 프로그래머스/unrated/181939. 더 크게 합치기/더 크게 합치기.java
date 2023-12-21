class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String anw = Integer.toString(a)+Integer.toString(b);
        String anw1 = Integer.toString(b)+Integer.toString(a);

        int a1 = Integer.parseInt(anw);
        int b1 = Integer.parseInt(anw1);

        answer = a1>=b1 ? a1 : b1;
        
        
        return answer;
    }
}