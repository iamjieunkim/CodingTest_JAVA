import java.util.Scanner;

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = (double)sum/numbers.length;



        return answer;
    }
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] numbers = new int[arr.length];
        int k=0;
        for(String i:arr){
            numbers[k++] = Integer.parseInt(i);
        }
        System.out.print(T.solution(numbers));
    }
}