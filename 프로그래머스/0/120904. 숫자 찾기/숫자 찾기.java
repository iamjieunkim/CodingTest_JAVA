class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String number = Integer.toString(num);
        String k2 = Integer.toString(k);
        for(int i=0; i<number.length(); i++){
            if(number.indexOf(k2)!=-1){
                answer = number.indexOf(k2)+1;
            }else{
                answer = -1;
            }
        }
            
        return answer;
    }
}