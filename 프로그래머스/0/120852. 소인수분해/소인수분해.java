import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int[] solution(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++){
            while(n%i==0){
                n=n/i;
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}