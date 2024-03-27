class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str  = "";

        for(int i=0; i<pat.length(); i++){
            if(pat.substring(i, i+1).equals("A")){
                str += "B";
            }else if(pat.substring(i, i+1).equals("B")){
                str += "A";
            }

        }

        answer = myString.indexOf(str)==-1?0:1;
        
        return answer;
    }
}