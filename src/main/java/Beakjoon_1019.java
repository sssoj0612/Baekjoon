import java.io.*;
public class Beakjoon_1019 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 페이지수 입력

        int[] count = new int[10]; // 각 숫자의 등장 횟수를 저장할 배열

        for (int i = 1; i <= N; i++) { // 페이지 수만큼 반복
            int num = i;
            while (num > 0) {
                count[num % 10]++; // 각 자릿수의 숫자 등장 횟수를 증가
                num /= 10;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(count[i] + " ");
        }

    }
}