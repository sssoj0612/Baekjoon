import java.util.Scanner;

public class Baekjoon_25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);{

            int x = s.nextInt(); // 총 금액 입력 받음
            int n = s.nextInt(); // 물건 종류 입력 받음

            int a,b; // a:물건 가격, b:물건 갯수
            int hap = 0; // hap:a와 b를 곱한 값을 누적

            for (int i=0 ; i<n ; i++){ // 물건의 종류 갯수만큼 반복
                a = s.nextInt(); // 물건 가격 입력 받음
                b = s.nextInt(); // 물건 갯수 입력 받음
                hap += a*b;
            }
            if (hap == x){ // 합이 입력했던 총 금액과 맞으면
                System.out.print("Yes"); // Yes 출력
            }
            else // 안 맞으면
                System.out.print("No"); // No출력
        }
    }
}
