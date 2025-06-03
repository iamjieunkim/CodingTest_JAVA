import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		Circulate(a, b);
	}

	public static int Circulate(int a, int b){
		int answer = (a+b)*(a-b);
		System.out.println(answer);
		return answer;
	}
}