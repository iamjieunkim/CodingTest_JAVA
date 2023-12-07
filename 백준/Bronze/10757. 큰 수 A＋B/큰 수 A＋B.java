import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger x = sc.nextBigInteger();
        BigInteger y = sc.nextBigInteger();

        //long보다 큰 수는 스스로 더할 수 없어서 n1.add(n2)함수를 이용해서 == n1+n2 더해준다.
        System.out.println(x.add(y));

    }
}