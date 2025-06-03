import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		long m = scanner.nextInt();

		long sum = Math.abs(n - m);
		System.out.println(sum);
	}
}