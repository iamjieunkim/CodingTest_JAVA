import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        myString = myString.trim();
        myString = myString.replaceAll("\\s+", "");
        myString = myString.replaceAll("x", " ");
        myString = myString.replaceAll("\\s+", "x");



        if(myString.indexOf("x")==0&&myString.indexOf("x")==myString.length()-1){
            myString = myString.substring(1, myString.length()-2);
        }else if (myString.indexOf("x")==myString.length()-1){
            myString = myString.substring(0, myString.length()-2);
        }else if(myString.indexOf("x")==0){
            myString = myString.substring(1);
        }

        answer = myString.split("x");

        Arrays.sort(answer);
        
        return answer;
    }
}