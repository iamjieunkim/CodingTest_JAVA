class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        my_string = my_string.trim();
        
        my_string = my_string.replaceAll("\\s+", " ");
        
        answer = my_string.split(" ");
        
        return answer;
    }
}