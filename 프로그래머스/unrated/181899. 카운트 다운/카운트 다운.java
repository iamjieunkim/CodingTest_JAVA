class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[(start+1)-end_num];

        for(int i=0; i<answer.length; i++){
            answer[i]=start--;
        }
        
        return answer;
    }
}