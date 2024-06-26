import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = new int[4];
        int answer = 0;
        dice[0] = a;
        dice[1] = b;
        dice[2] = c;
        dice[3] = d;
        
        
        Arrays.sort(dice);
        
        if(dice[0]==dice[3]){
            answer = 1111*a;
        }else if(dice[0]==dice[2]){
            answer = (10*dice[0]+dice[3])*(10*dice[0]+dice[3]);
        }else if(dice[1]==dice[3]){
            answer = (10*dice[3]+dice[0])*(10*dice[3]+dice[0]);
        }else if(dice[0]==dice[1]&&dice[2]==dice[3]){
            answer = (dice[0]+dice[2]) * Math.abs(dice[0]-dice[2]);
        }else if(dice[0]==dice[1]){
            answer = dice[2]*dice[3];
        }else if(dice[1]==dice[2]){
            answer = dice[0]*dice[3];
        }
        else if(dice[2]==dice[3]){
            answer = dice[0]*dice[1];
        }else{
            answer = dice[0];
        }
        
        
        return answer;
    }
}