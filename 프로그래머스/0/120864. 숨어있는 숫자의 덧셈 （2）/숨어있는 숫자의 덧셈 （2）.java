class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.toLowerCase();
        my_string = my_string.replaceAll("[^0-9]", " ");
        my_string = my_string.replaceAll("\\s+", " ");
        
        if(my_string.length()==1){
            return 0;
        }else{
            my_string = my_string.trim();
            String[] arr = my_string.split(" ");

            for(int i=0; i<arr.length; i++){
                answer += Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}