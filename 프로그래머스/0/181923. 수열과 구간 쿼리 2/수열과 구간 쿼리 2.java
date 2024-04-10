class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i=0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            int c = queries[i][2];


            int min = 0;
            for(int j=a; j<=b; j++){
                if(arr[j]>c){
                    min = arr[j];
                }else{
                    answer[i] = -1;
                }
            }

            for(int k=a; k<=b; k++){
                if(arr[k]>c){
                    if(arr[k]<min){
                        min = arr[k];
                        answer[i] = min;
                    }else{
                        answer[i] = min;
                    }
                }
            }

        }
        return answer;
    }
}