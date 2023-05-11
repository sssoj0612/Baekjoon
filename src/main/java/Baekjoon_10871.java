import java.util.Scanner;
public class Baekjoon_10871 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 입력 할 정수의 수를 입력받음.
        int x = s.nextInt(); // 정수 x를 입력받음.
        int[] a = new int[n]; // n개의 정수를 저장할 배열 선언.

        for (int i=0 ; i<n ; i++){ // 수열 a를 입력하기 위한 for문
            a[i] = s.nextInt(); // 배열 a는 n개가 될 때까지 입력 받음.
        }

        for (int i=0 ; i<n ; i++){ // x보다 작은 정수를 출력하기 위한 for문
            if (a[i] < x) { // 배열 a의 i번째 값이 x보다 작으면
                System.out.print(a[i] + " "); // 해당 값을 출력
            }
        }
    }
}
