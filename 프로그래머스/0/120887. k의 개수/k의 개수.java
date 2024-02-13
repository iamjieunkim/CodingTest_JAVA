class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] idx = new String[j-i+1];


        for(int t=i, w=0; t<=j; t++){
            idx[w++] = Integer.toString(t);
        }

        for(int a=0; a< idx.length; a++){
            for(int b=0; b<idx[a].length(); b++){
                if(Integer.parseInt(idx[a].substring(b,b+1))==k){
                    answer++;
                }
            }
        }
        return answer;
    }
}