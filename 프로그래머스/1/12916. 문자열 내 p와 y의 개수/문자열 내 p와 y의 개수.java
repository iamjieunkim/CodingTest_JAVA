class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s= s.toLowerCase();
        int cntp=0;
        int cnty=0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i,i+1).equals("p")){
                cntp++;
            }else if(s.substring(i,i+1).equals("y")){
                cnty++;
            }
        }
        System.out.println(s);

        System.out.println(cntp+" "+cnty);
        answer = cntp==cnty?true:false;

        return answer;
    }
}