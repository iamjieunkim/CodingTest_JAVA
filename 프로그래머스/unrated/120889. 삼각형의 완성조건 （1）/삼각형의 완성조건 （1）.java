class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max=sides[0];
        int min=sides[0];
        int center = sides[0];
        
        for(int i=0; i<sides.length; i++){
            if(sides[i]>max){
                max = sides[i];
            }else if(sides[i]<min){
                min = sides[i];
            }else if(min<sides[i] && max>sides[i]){
                center = sides[i];
            }
        }
        
        if(max<min+center){
            answer=1;
        }else{
            answer=2;
        }
        
        return answer;
    }
}