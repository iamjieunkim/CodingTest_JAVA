class Solution {
    public String[] solution(String[] strArr) {
        int idx=0;

        for(int i=0; i<strArr.length; i++){
            if(strArr[i].indexOf("ad")!=-1){
                idx++;
            }
        }

        String[] answer = new String[strArr.length-idx];

        for(int i=0, j=0; i< strArr.length; i++){
            if(strArr[i].indexOf("ad")==-1){
                answer[j++] = strArr[i];
            }
        }

        
        return answer;
    }
}