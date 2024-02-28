class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i< quiz.length; i++){
            String a = quiz[i];
            a = a.replace(" + ", "p");
            a = a.replace(" - ", "m");
            a = a.replace(" = ", "r");
            a = a.trim();


            if(a.indexOf("p")>0){
                int x = a.indexOf("p");
                int y = a.indexOf("r");
                int x1 = Integer.parseInt(a.substring(0,x));
                int x2 = Integer.parseInt(a.substring(x+1 , y));
                int ans = Integer.parseInt(a.substring(y+1, a.length()));
                if(x1+x2==ans){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }else if(a.indexOf("m")>0){
                int x = a.indexOf("m");
                int y = a.indexOf("r");
                int x1 = Integer.parseInt(a.substring(0,x));
                int x2 = Integer.parseInt(a.substring(x+1, y));
                int ans = Integer.parseInt(a.substring(y+1, a.length()));
                if(x1-x2==ans){
                    answer[i]="O";
                }else{
                    answer[i]="X";
                }
            }


        }
        return answer;
    }
}