class Solution {
    public int solution(int[] numbers) {
        int result = 0;

        boolean check[] = new boolean[10];

        for(int i=0; i<numbers.length; i++){
            if(check[numbers[i]]==false){

                check[numbers[i]]=true;
            }
        }

        for(int i=0; i<10; i++){
            if(check[i]==false){
                result+=i;
            }
        }
        
    
        return result;
    }
}