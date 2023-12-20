class Solution {
    public String solution(int age) {
        String answer = "";
        String[] ans = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

        if(age==1000){
            answer="baaa";
        }else if(age>=100){
            answer=ans[age/100]+ans[(age%100/10)]+ans[(age%100%10)];
        }else if(age>=10){
            answer=ans[age/10]+ans[age%10];
        }else if(age>=0){
            answer=ans[age];
        }
        
        return answer;
    }
}