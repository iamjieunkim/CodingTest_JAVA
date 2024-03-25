class Solution {
    public int solution(int n) {
        int x = 1;
        int s = 1;
        int answer = 0;

        while(s<=(n)){
            s *= x++;
        }

        int aa = 0;
        int bb = 0;

        for(int i=1; i<=x-1; i++){
            aa *= i;
        }
        for(int i=1; i<x-2; i++){
            bb *=i;
        }

        if(n-aa<n-bb){
            answer = x-1;
        }else{
            answer = x-2;
        }
        
        return answer;
    }
}