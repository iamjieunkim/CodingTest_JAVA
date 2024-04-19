import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Arrays.sort(array);
        answer=array[array.length/2];
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] array = new int[arr.length];
        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(T.solution(array));
    }
}