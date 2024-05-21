import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        if(n!=0){
            list.add(1);
            for(int i=2; i<=n; i++){
                if(n%i==0){
                    list.add(i);
                }
            }
        }
        

        for(int i=0; i<list.size(); i++){
            answer += list.get(i);
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