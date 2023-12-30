class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length+1-n];
        
        for(int i=n-1; i<num_list.length; i++){
                answer[i-n+1]=num_list[i];
        }
        
        return answer;
    }
}