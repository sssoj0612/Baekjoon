import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Baekjoon_11021 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine()); // 테스트케이스의 개수는 입력 받음.

        for(int i=1 ; i<t+1 ; i++){ // 테스트케이스만큼 입력하고 출력하기 위한 for문.
            StringTokenizer st = new StringTokenizer(br.readLine()," "); // 입력할 값들은 공백으로 구분.
            int a = Integer.parseInt(st.nextToken()); // a는 입력 받음.
            int b = Integer.parseInt(st.nextToken()); // b는 입력 받음.
            System.out.println("Case #" + i + ": " + (a+b)); // a+b의 결과를 출력함
        }
    }
}