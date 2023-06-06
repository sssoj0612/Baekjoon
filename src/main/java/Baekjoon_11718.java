import java.io.*;
public class Baekjoon_11718 {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;

        while ( (str = br.readLine()) != null ){
            // str은 br를 사용하여 null이 될 때까지 한줄을 입력함.
            bw.write(str); // 읽어온 line을 출력버퍼 bw에 씀.
            bw.newLine(); // 새로운 줄로 이동.
        }

        br.close();
        bw.close();
    }
}
