import java.io.*;
public class Baekjoon_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().trim(); // 문자열 입력받고 양쪽 공백 제거

        String[] word = str.split(" "); // 공백을 기준으로 문자열 분리하여 배열에 저장

        int count = word.length; // 정수형 변수에 배열의 크기를 대입

        if (str.isEmpty()) { // 만약 입력한 문자열이 공백이면
            count = 0; // 단어 개수는 0
        }
        System.out.print(count); // 단어 개수 출력

        br.close();
    }
}