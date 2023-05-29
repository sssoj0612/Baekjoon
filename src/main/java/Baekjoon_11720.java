import java.util.Scanner;
public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 숫자의 개수
        String num = s.next(); // 숫자 공백 없이 입력

        int sum = 0; // 숫자의 합계 0으로 초기화

        for (int i=0 ; i<n ; i++) { // 합계 구하기 위한 for문
            sum += num.charAt(i) - '0';
            // 문자열의 i번째 값을 가져와서 정수로 변환하기 위해 '0'을 빼준 뒤 합계에 누적.
        }
        System.out.print(sum);
        s.close();
    }
}