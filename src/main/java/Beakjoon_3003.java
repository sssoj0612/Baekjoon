import java.util.Scanner;
public class Beakjoon_3003 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] piece = {1, 1, 2, 2, 2, 8};
        // 체스는 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성

        for (int i = 0; i < 6; i++) { // 더하거나 빼야할 피스의 개수를 찾기 위한 for문
            int findPiece = s.nextInt(); // 발견한 피스의 개수는 입력 받는다.
            int result = piece[i] - findPiece;
            // 기존 배열의 i번째 피스의 개수에서 발견한 피스의 개수를 뺀다.
            System.out.print(result + " "); // 결과 출력
        }
    }
}