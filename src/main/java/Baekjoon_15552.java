import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);

        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        int t = Integer.parseInt(br.readLine()); //테스트 케이스의 개수를 입력 받고 츌력.

        for(int i=0 ; i<t ; i++){ //테스트 개수만큼 입력 받는 for문
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]); // 숫자 a 입력 받음
            int b = Integer.parseInt(input[1]); // 숫자 b 입력 받음
            bw.write((a+b)+"\n"); // a+b 결과를 출력함
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
