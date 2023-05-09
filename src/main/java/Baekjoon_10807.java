import java.util.Scanner;

public class Baekjoon_10807 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 입력할 정수의 개수

        int[] num = new int[n]; // 숫자를 저장할 배열 선언

        for (int i=0 ; i<n ; i++) { // 숫자 입력하기 위한 for문
            num[i] = s.nextInt(); // 배열 num은 n개가 될 때까지 입력받는다
        }

        int v = s.nextInt(); // 몇 개인지 확인할 숫자 입력
        int count = 0; // 등장 횟수를 저장할 변수

        for (int i=0 ; i<n ; i++) { // v가 몇 개인지 확인하기 위한 for문
            if (num[i] == v) {
                count++;
            }
        }
        System.out.println(count); // v 갯수 출력
    }
}
