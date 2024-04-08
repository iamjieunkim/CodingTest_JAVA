class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int row = 0;
        int height = 0;

        for(int i=1; i<dots.length; i++){
            if(dots[i][1]==dots[0][1]){
                row = Math.abs(dots[i][0]-dots[0][0]);
            } else if (dots[i][0]==dots[0][0]) {
                height = Math.abs((dots[i][1]-dots[0][1]));
            }

        }

        answer = row * height;
        
        return answer;
    }
}