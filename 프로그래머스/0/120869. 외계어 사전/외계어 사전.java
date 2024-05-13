import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i=0; i<dic.length; i++){
            for(int j=0; j< spell.length; j++){
                if(dic[i].contains(spell[j])){
                    dic[i] = dic[i].replaceFirst((spell[j]),"-");
                }
            }
        }

        String str = "";
        for(int i=0; i<spell.length; i++){
            str+="-";
        }
        
        for(int i=0; i<dic.length; i++){
            if(dic[i].equals(str)&&dic[i].length()== spell.length){
                answer=1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String[] spell = str1.split(" ");
        String str2 = sc.nextLine();
        String[] dic = str2.split(" ");
        System.out.println(T.solution(spell, dic));
    }
}