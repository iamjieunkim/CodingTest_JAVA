class Solution {
    public int solution(String s) {
        int answer = 0;
        int sum = 0;
        int mus = 0;
        String t = s;

        if(s.indexOf("Z")==-1){
            s = s.replaceAll("\\s+", " ");
            String arr[] = s.split(" ");
            for(int i=0; i<arr.length; i++){
                answer+=Integer.parseInt(arr[i]);
            }
        }else{
            t = t.replaceAll("Z", "");
            t = t.replaceAll("\\s+", " ");
            System.out.println(t);
            String idx[] = t.split(" ");
            for(int i=0; i<idx.length; i++){
                sum+=Integer.parseInt(idx[i]);
            }

            String idxs[] = s.split(" ");
            for(int i=0; i<idxs.length; i++){
                if(idxs[i].equals("Z")){
                    mus += Integer.parseInt(idxs[i-1]);
                }
            }

            answer = sum -mus;

            
        }
        return answer;
    }
}