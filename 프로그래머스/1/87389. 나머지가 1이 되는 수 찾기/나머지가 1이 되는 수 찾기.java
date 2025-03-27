class Solution {
    public int solution(int n) {
        int answer = 1;

        while (true) {
            if(n%answer%answer != 1){
                answer++;
            }else{
                break;
            }
        }
        return answer;
    }
}