class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int mult = 1;
        
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            mult *= num_list[i];
        }
        
        
        answer = (mult < sum*sum) ? 1 :0;
        
        return answer;
    }
}