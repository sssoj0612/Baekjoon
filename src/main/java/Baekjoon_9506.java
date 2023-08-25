import java.io.*;
import java.util.ArrayList;

public class Baekjoon_9506 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = Integer.parseInt(br.readLine()); // 입력한 숫자
            ArrayList<Integer> list = new ArrayList<>(); // 약수들 저장 할 List 선언
            int hap = 0; // 약수들의 합

            if (n == -1) { // -1을 입력하면
                break; // 반복문 탈출
            }

            for (int i = 1; i <= n / 2; i++) { // n의 약수 찾는 for문
                if (n % i == 0) { // i가 n의 약수라면
                    list.add(i); // list에 저장
                    hap += i; // 약수의 합을 누적
                }
            }

            bw.write(String.valueOf(n)); // n 출력

            if (hap == n) { // n이 약수들의 합과 같다면 (완전수라면)
                bw.write(" = ");
                for (int i = 0; i < list.size() - 1; i++) { // 출력문
                    bw.write(list.get(i) + " + ");
                }
                bw.write(list.get(list.size() - 1) + "\n");
            } else { // n이 완전수가 아니라면
                bw.write(" is NOT perfect.\n"); // 출력문
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}