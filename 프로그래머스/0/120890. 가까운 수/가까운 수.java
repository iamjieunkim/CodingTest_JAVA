import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        int[] arr = new int[array.length];
        for(int i=0; i< array.length; i++){
            if((array[i]-n)<0){
                arr[i]=(array[i]-n)*-1;
            }else{
                arr[i]=array[i]-n;
            }
        }

        int min = arr[0];
        int a=0;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i]){
                min=arr[i];
                a=i;
            }
        }

        answer = array[a];
        
        return answer;
    }
}