import java.util.Scanner;
public class Baekjoon_2675 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt(); // 테스트 개수 입력 받음.

        for (int i = 0; i < t; i++) { // 반복횟수와 문자열을 입력하기 위한 for문
            int r = s.nextInt(); // 반복횟수 t만큼 입력 받음.
            String str = s.next(); // 문자열 t만큼 입력 받음.

            for (int j = 0; j < str.length(); j++) { // 문자열의 각 문자를 반복하기 위한 이중 for문
                for (int k = 0; k < r; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}