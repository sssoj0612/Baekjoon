import java.util.Scanner;
public class Baekjoon_10813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // 바구니 개수
        int M = s.nextInt(); // 공을 몇 번 바꿀건지

        int[] baskets = new int[N]; // 바구니 배열

        for (int a=0 ; a<N ; a++) { // 각 바구니에 들어있는 공의 번호를 설정하기 위한 for문
            baskets[a] = a+1; // 각 바구니에는 바구니 번호와 같은 공이 들어있음 (공은 1번부터니까 1을 더함)
        }

        for (int b=0 ; b<M ; b++){ // 공을 바꾸기 위한 for문
            int i = s.nextInt()-1 ; // i번 바구니와 (배열은 0번째부터 시작하니까 1을 뻄)
            int k = s.nextInt()-1 ; // k번 바구니 공을 바꿈

            int tmp = baskets[i]; // i번 바구니의 공을 저장해둘 빈 변수
            baskets[i] = baskets[k]; // i번 바구니에 k를 대입
            baskets[k] = tmp; // k번 바구니에 i번 바구니를 저장해두었던 tmp를 대입
            }

        for (int c=0 ; c<N ; c++){ // 바구니에 들어있는 공의 번호를 출력하기 위한 for문
            System.out.print((baskets[c]) + " ");
        }
    }
}
