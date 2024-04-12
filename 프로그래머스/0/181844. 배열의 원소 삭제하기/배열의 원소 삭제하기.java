import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i:arr){
            list.add(i);
        }

        for(int i:arr){
            for(int j : delete_list){
                if(i==j){
                    list.remove(Integer.valueOf(i));
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i< answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}