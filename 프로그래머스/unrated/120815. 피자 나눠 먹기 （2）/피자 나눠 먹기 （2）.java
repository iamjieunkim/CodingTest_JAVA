class Solution {
    public int solution(int n) {
        
        int cnt = 0;
        for(int i=1;i <= 6;i++){
            if(n%i == 0 && 6%i == 0){ 
                cnt = i;
            }
        }
        int answer = n/cnt;
        
        return answer;
    }
}
