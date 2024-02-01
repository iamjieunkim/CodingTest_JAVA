class Solution {
    public int solution(int order) {
        int answer = 0;
        String idx = Integer.toString(order);
        for(int i=0; i<idx.length(); i++){
            if(idx.charAt(i)=='3'||idx.charAt(i)=='6'||idx.charAt(i)=='9'){
                answer++;
            }
        }
        return answer;
    }
}