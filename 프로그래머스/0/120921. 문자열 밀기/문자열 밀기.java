class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String c = A;
        
        for(int i = 0; i < A.length(); i++){
            if(c.equals(B)){
                return answer;
            }
            String a = c.substring(c.length()-1);
            c = a + c.substring(0, c.length()-1);
            answer++;
        }
        return -1;
        
    }
}