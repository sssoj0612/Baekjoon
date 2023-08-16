import java.io.*;
public class Baekjoon_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" "); // 공백으로 구분하여 입력
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);
        int d = 1; // 이미 첫 번째 날은 올라갔으니 1로 초기화

        v -= a; // 첫 번째 날을 이미 더해줬으므로 빼줌
        int i = a - b; // 최종 올라갈수있는 높이

        d += (v + i - 1) / i; // 올라가야 할 높이를 남은 속도로 나눈 뒤 올림

        bw.write(String.valueOf(d));
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}