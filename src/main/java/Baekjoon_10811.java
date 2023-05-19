import java.util.Scanner;
public class Baekjoon_10811 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 바구니 개수
        int m = s.nextInt(); // 바구니 몇 번 바꿀건지

        int basket[] = new int[n + 1]; // 번호는 1번부터 시작하니까 1을 더해줌

        for (int i = 1; i <= n; i++) { // 처음 바구니 배열을 설정하기 위한 for문
            basket[i] = i; // 1번부터 N번까지 바구니 배열
        }

        for (int i = 0; i < m; i++) { // 바구니 바꿀 방법을 입력하기 위한 for문
            int start = s.nextInt(); // 입력한 바구니부터
            int end = s.nextInt(); // 입력한 바구니까지

            newbasket(basket, start, end); // 바구니 배열을 역순으로 바꾸는 메서드 호출
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(basket[i] + " "); // 변경 된 바구니 배열 출력
        }
    }

    public static void newbasket(int[] basket, int start, int end) { // 메서드
        while (start < end) { // 시작번호가 끝번호보다 작을 때
            int tmp = basket[start]; // tmp 변수에 시작번호를 대입해둠
            basket[start] = basket[end]; // 시작번호에 끝번호 대입
            basket[end] = tmp; // 끝번호에 시작번호 대입해둔 tmp 대입
            start++; // 다음 번호들을 역순하기 위해 시작번호 증감
            end--; // 다음 번호들을 역순하기 위해 끝번호 감소
        }
    }
}
