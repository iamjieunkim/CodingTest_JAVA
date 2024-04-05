class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int[] arr = new int[numbers.length*k];

        int idx = 0;
        for(int i=0; i<k; i++){
            for(int j=0; j<numbers.length; j++){
                arr[idx++]=numbers[j];
            }
        }

        answer = arr[2*k-2];
        
        return answer;
    }
}