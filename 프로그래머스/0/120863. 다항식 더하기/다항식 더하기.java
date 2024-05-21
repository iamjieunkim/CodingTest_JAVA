import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll("\\s+", "");
        String arr[] = polynomial.split("\\+");
        int x =0, sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                if(arr[i].indexOf("x")==0){
                    x+=1;
                }else{
                    int a = arr[i].indexOf("x");
                    x+=Integer.parseInt(arr[i].substring(0,a));
                }
            } else if (arr[i].indexOf("x")==-1) {
                sum += Integer.parseInt(arr[i]);
            }
        }

        if(x!=0) {
            if (sum == 0&&x!=1) {
                answer = Integer.toString(x) + "x";
            } else if (x==1) {
                if(sum==0){
                    answer = "x";
                }else{
                    answer = "x + "+ Integer.toString(sum);
                }
            } else {
                answer = Integer.toString(x) + "x" + " + " + Integer.toString(sum);
            }
        } else if (x==0) {
            if (sum == 0) {
                answer = Integer.toString(0);
            } else {
                answer = Integer.toString(sum);
            }
        }


        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String polynomial = sc.nextLine();
        System.out.println(T.solution(polynomial));
    }
}