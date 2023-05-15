import java.util.Scanner;
public class Baekjoon_10810 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // 바구니 개수
        int M = s.nextInt(); // 공을 몇 번 넣을건지

        int[] baskets = new int[N]; // 바구니 배열

        for (int a = 0; a < M; a++) { // 공을 바구니에 넣기위한 for문
            int i = s.nextInt() - 1; // 시작 바구니 번호 (0부터 시작하도록 1을 뺌)
            int j = s.nextInt() - 1; // 끝 바구니 번호 (0부터 시작하도록 1을 뺌)
            int k = s.nextInt(); // 공 개수

            for (int b = i; b <= j; b++) { // 끝 바구니까지 공을 넣기위한 이중 for문
                baskets[b] = k;
            }
        }

        for (int i = 0; i < N; i++) { // 각 바구니에 있는 공 번호를 출력하기 위한 for문
            System.out.print(baskets[i] + " ");
        }
    }
}
