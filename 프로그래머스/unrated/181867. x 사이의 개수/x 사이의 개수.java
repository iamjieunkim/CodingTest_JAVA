class Solution {
    public int[] solution(String myString) {
        String arr[] = myString.split("x");

        if(myString.charAt(myString.length()-1)=='x'){
            int[] answer = new int[arr.length+1];
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i].length();
                answer[arr.length] = 0;
            }
            return answer;
        }else{
            int[] answer = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i].length();
            }
            return answer;
        }
        
    }
}