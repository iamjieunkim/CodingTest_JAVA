class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        
        for(int i=0; i<arr.length; i++){
            if(i>=idx){
                if(arr[i]==1){
                    answer = i;
                    break;
                }
            }else if(i<idx){
                answer = -1;
            }
        }
        return answer;
    }
}