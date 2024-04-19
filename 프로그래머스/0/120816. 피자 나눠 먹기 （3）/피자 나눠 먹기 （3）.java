import java.util.Scanner;
class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        answer = n%slice==0 ? n/slice : n/slice+1;
        
        return answer;
    }
    
    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int slice = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(T.solution(slice, n));
    }
}