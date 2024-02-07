class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for(int i=0; i< answer.length; i++){
            int sum = (num-1)*num/2;
            answer[i] = (total-sum)/num + i;
        }
        
        return answer;
    }
}