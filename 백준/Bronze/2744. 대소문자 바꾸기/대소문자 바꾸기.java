import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String answer = "";

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)) {
				answer += Character.toUpperCase(ch);
			} else if(Character.isUpperCase(ch)) {
				answer += Character.toLowerCase(ch);
			}
		}
		System.out.println(answer);
	}
}
