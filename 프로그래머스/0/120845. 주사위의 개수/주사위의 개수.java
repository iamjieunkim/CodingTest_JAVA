import java.util.Scanner;
class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;
        
        int a = box[0]/n;
        int b = box[1]/n;
        int c = box[2]/n;

        answer = a*b*c;
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int[] box = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            box[i] = Integer.parseInt(arr[i]);
        }
        int n = sc.nextInt();
        System.out.println(T.solution(box, n));
    }
}