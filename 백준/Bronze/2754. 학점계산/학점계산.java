import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		str = str.toUpperCase();
		double answer = 0;

		if(str.length() == 1){
			answer = 0.0;
		}else{
			if(str.charAt(1)=='+'){
				if(str.charAt(0)=='A'){
					answer = 4.3;
				}else if(str.charAt(0)=='B'){
					answer = 3.3;
				}else if(str.charAt(0)=='C'){
					answer = 2.3;
				}else if(str.charAt(0)=='D'){
					answer = 1.3;
				}
			}else if(str.charAt(1)=='0'){
				if(str.charAt(0)=='A'){
					answer = 4.0;
				}else if(str.charAt(0)=='B'){
					answer = 3.0;
				}else if(str.charAt(0)=='C'){
					answer = 2.0;
				}else if(str.charAt(0)=='D'){
					answer = 1.0;
				}
			}else if(str.charAt(1)=='-'){
				if(str.charAt(0)=='A'){
					answer = 3.7;
				}else if(str.charAt(0)=='B'){
					answer = 2.7;
				}else if(str.charAt(0)=='C'){
					answer = 1.7;
				}else if(str.charAt(0)=='D'){
					answer = 0.7;
				}
			}
		}

		System.out.println(answer);
	}
}