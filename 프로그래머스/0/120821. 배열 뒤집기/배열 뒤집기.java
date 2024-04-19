import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
       for(int i=0; i<num_list.length; i++){
           answer[i]=num_list[(num_list.length-1)-i];
       }


        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] num_list = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            num_list[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(T.solution(num_list));
    }
}