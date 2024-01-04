import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 30명의 학생 중 28명이 제출한 출석번호 배열
        int[] attend = new int[30];

        // 제출한 출석번호를 받아서 배열에 체크
        for (int i = 0; i < 28; i++) {
            int std = sc.nextInt();
            attend[std - 1] = 1;
        }

        // 제출하지 않은 학생의 출석번호 찾기
        int missingStudent1 = -1;
        int missingStudent2 = -1;

        for (int i = 0; i < attend.length; i++) {
            if (attend[i] == 0) {
                if (missingStudent1 == -1) {
                    missingStudent1 = i + 1;
                } else {
                    missingStudent2 = i + 1;
                    break;
                }
            }
        }

        // 결과 출력
        System.out.println(missingStudent1);
        System.out.println(missingStudent2);
    }
}
