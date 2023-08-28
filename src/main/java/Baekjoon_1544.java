import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Baekjoon_1544 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 입력할 단어 수
        int cnt = 0; // 같은 단어 수
        HashSet<String> word = new HashSet<>(); // 단어 저장할 HashSet

        for (int i = 0; i < n; i++) { // 입력받기 위한 for문
            String input = br.readLine(); // input 변수에 한 줄씩 입력
            if (!cycle(input, word)) { // 같은 단어가 아니라면
                cnt++; // cnt 증가
            }
            word.add(input); // HashSet
        }

        bw.write(String.valueOf(cnt)); // 답 출력

        br.close();
        bw.flush();
        bw.close();
    }

    public static boolean cycle(String input, HashSet<String> word) { // 같은 단어인지 확인하는 메서드
        for (int i = 1; i < input.length(); i++) {
            String alphabet = input.substring(i) + input.substring(0, i);
            if (word.contains(alphabet)) {
                return true;
            }
        }
        return false;
    }
}