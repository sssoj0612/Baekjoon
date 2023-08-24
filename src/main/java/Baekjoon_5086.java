import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon_5086 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a==0 && b==0){ // 만약 a,b에 0을 입력하면 종료한다.
                break;
            }

            if (b%a==0){ // a가 b의 약수라면
                bw.write("factor\n");
            } else if (a%b==0) { // a가 b의 배수라면
                bw.write("multiple\n");
            }
            else { // 둘 다 아니라면
                bw.write("neither\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}