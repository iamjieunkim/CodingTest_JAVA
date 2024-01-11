import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList array = new ArrayList();
        array.add(n);
        
         while (true){
            if (n % 2 == 0){
                array.add(n / 2);
                n /= 2;
            }
            else {
                array.add((3 * n ) + 1);
                n = (3 * n) + 1;
            }
            if (n == 1){
                break;
            }
        }


        int[] answer = new int[array.size()];   
        
        for(int i=0; i<answer.length; i++){
             answer[i] = (int)array.get(i);
        }
        return answer;
    }
}