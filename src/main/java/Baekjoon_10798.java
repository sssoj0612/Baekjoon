import java.util.Scanner;

public class Baekjoon_10798 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] lines = new String[5]; // 입력받을 문자열 배열 선언

        // 5개의 문자열 입력받기
        for (int i = 0; i < 5; i++) {
            lines[i] = s.nextLine();
        }

        StringBuilder sb = new StringBuilder();

        // 세로로 읽기
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < lines[j].length()) {
                    sb.append(lines[j].charAt(i));
                }
            }
        }

        System.out.println(sb.toString()); // 결과 출력
    }
}