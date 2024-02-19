class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        myStr = myStr.replaceAll("\\s+", "");
        myStr = myStr.replaceAll("[abc]"," ");
        myStr = myStr.replaceAll("\\s+", "a");

        if(myStr.length()==1&&myStr.charAt(0)=='a'){
            myStr = "EMPTYa";
        }else if(myStr.indexOf("a")==0&&myStr.length()>=2){
            myStr = myStr.substring(1);
        } else if (myStr.indexOf("a")==myStr.length()-1) {
            myStr = myStr.substring(0,myStr.length()-2);
        }
        answer = myStr.split("a");
        
        return answer;
    }
}