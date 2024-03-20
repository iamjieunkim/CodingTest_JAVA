import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] ne = new int[emergency.length];

        for(int i=0; i<emergency.length; i++){
            ne[i] = emergency[i];
        }

        Arrays.sort(ne);

        for(int i=0; i< emergency.length; i++){
            for(int j=0; j<ne.length; j++){
                if(emergency[i]==ne[j]){
                    answer[i] = emergency.length - j;
                    break;
                }
            }
        }
        
        
        return answer;
    }
}