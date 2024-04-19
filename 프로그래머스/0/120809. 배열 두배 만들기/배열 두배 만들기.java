import java.util.Scanner;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            answer[i]=numbers[i]*2;
        }
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] numbers = new int[arr.length];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(T.solution(numbers));
    }
}