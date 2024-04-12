class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;

        if(arr1.length>arr2.length){
            answer = 1;
        } else if (arr1.length<arr2.length) {
            answer = -1;
        }
        
        if (arr1.length==arr2.length) {
            for(int i : arr1){
                sum1 += i;
            }
            for(int k : arr2){
                sum2 += k;
            }
            if(sum1>sum2){
                answer = 1;
            } else if (sum1<sum2) {
                answer = -1;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}