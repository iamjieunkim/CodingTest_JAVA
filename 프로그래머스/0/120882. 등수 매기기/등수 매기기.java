class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] avg = new int[score.length];
        for(int i=0; i<score.length; i++){
            for(int j=0; j<score[i].length; j++){
                avg[i] += score[i][j];
            }
        }

        for(int i=0; i<avg.length; i++){
            int rank = 1;
            for(int j=0; j<avg.length; j++){
                if(avg[i]<avg[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }
}