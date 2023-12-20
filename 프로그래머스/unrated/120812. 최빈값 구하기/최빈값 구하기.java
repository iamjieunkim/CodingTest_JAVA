import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        int answer = -1;  
        int maxFrequency = 0;

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            int currentFrequency = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (currentNumber == array[j]) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                answer = currentNumber;
            } else if (currentFrequency == maxFrequency) {
                answer = -1;
            }
        }

        return answer;
    }
}
