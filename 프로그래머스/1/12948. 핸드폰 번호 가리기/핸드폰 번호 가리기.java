import java.util.Scanner;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String str = phone_number.substring(0,phone_number.length()-4);
        int n = phone_number.length()-4;
        String star = "";
        for(int i=0; i<n; i++){
            star+="*";
        }
        answer = phone_number.replaceAll(str,star);
        return answer;
    }
}