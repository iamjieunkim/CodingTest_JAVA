class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int sum = 0;


        for(int i=0; i<intervals.length; i++){
            sum += (intervals[i][1]-intervals[i][0]+1);
        }

        int[] answer = new int[sum];
        int k = 0;
        
        for(int i=0; i<intervals.length; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                answer[k++] = arr[j];
            }
        }
        return answer;
    }
}