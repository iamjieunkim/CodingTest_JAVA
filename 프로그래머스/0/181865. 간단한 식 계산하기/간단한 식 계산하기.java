class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int idx = 0;
        
        binomial = binomial.replaceAll("\\s+", "");

        if(binomial.indexOf("+")!=-1){
            idx = binomial.indexOf("+");
            int a = Integer.parseInt(binomial.substring(0,idx));
            int b = Integer.parseInt(binomial.substring(idx+1, binomial.length()));
            answer = a+b;

        }else if(binomial.indexOf("-")!=-1){
            idx = binomial.indexOf("-");
            int a = Integer.parseInt(binomial.substring(0,idx));
            int b = Integer.parseInt(binomial.substring(idx+1, binomial.length()));
            answer = a-b;

        }else if(binomial.indexOf("*")!=-1){
            idx = binomial.indexOf("*");
            int a = Integer.parseInt(binomial.substring(0,idx));
            int b = Integer.parseInt(binomial.substring(idx+1, binomial.length()));
            answer = a*b;
        }
        
        return answer;
    }
}