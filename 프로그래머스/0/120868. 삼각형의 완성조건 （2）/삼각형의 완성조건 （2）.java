class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        if(sides[0]==sides[1]){
            for(int i=1; i<sides[0]+sides[1]; i++){
                answer++;
            }
        }else if(sides[0]>sides[1]){
            for(int i=sides[0]-sides[1]+1; i<=sides[0]; i++){
                if(sides[0]<sides[1]+i){
                    answer++;
                }
            }
        }else if(sides[0]<sides[1]){
            for(int i=sides[1]-sides[0]+1; i<=sides[1]; i++){
                if(sides[1]<sides[0]+i){
                    answer++;
                }
            }
        }

        if(sides[0]>sides[1]){
            for(int i=sides[0]+1; i<sides[0]+sides[1]; i++){
                answer++;
            }
        } else if (sides[0]<sides[1]) {
            for(int i=sides[1]+1; i<sides[0]+sides[1]; i++){
                answer++;
            }
        }
        
        return answer;
    }
}