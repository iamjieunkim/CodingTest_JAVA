import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);

        answer = String.valueOf(a1.add(b1));
        
        return answer;
    }
}