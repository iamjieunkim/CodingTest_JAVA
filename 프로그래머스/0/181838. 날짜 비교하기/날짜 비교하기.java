class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        if(date2[0]-date1[0]>0){
            answer = 1;
        }

        if(date2[0]-date1[0]==0){
            if(date2[1]-date1[1]>0){
                answer = 1;
            }
        }

        if(date2[0]-date1[0]==0){
            if(date2[1]-date1[1]==0){
                if(date2[2]-date1[2]>0){
                    answer = 1;
                }
            }
        }
        return answer;
    }
}