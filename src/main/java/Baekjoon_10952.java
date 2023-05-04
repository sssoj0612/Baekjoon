import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.*;
public class Baekjoon_10952 {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);

        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        while (true){ // 값을 입력하기 위한 while문
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]); // 숫자 a 입력 받음
            int b = Integer.parseInt(input[1]); // 숫자 b 입력 받음

            if (a==0 && b==0) // 만약 a와 b에 0이 입력 되면
                break; // while문을 빠져나간다.

            bw.write((a+b)+"\n"); // a+b 결과를 출력함
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
