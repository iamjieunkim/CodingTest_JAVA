class Solution {
    public int[] solution(int n) {
        int idx = 0;

        for(int i=1; i<=n; i++){
            if((n%i)==0){
                idx++;
            }
        }

        int[] answer = new int[idx];

        for(int j=1, i=0; j<=n; j++){
            if((n%j==0)){
                answer[i++]=j;
            }
        }
        
        return answer;
    }
}