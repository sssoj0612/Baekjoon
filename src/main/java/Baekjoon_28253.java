import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon_28253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 문자열 배열 input에 공백으로 구분 된 값을 입력 받음.
        String[] input = br.readLine().split(" ");

        // 정수형 변수에 입력 받은 값을 형변환 해서 저장
        int L = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);

        String X = br.readLine(); /* X는 어떤 정수의 연속된 부분에 포함 될 수 있으니
        문자로 입력 받음 */

        int count = 0; // X를 포함하고 있는 정수의 개수

        for (int i = L; i <= R; i++) { // L부터 R까지 반복
            String num = String.valueOf(i);
            // i를 문자열로 변환해서 i에 X가 포함되어있다면
            if (num.contains(X)) {
                count++; // count 증감
            }
        }

        sb.append(count); // 출력 클래스에 count 추가함.
        System.out.print(sb.toString()); // 결과 출력
    }
}