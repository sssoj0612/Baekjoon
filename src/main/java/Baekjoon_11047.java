import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Baekjoon_11047 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken()); // 동전의 종류 수
        int k = Integer.parseInt(st.nextToken()); // 만들고싶은 금액
        List<Integer> a = new ArrayList<>(); // 동전 종류 저장할 리스트
        int cnt = 0; // 필요한 동전의 최소 개수

        for (int i=0 ; i<n ; i++){ // 동전의 가치를 입력하기 위한 for문
            a.add(Integer.valueOf(br.readLine())); // 리스트에 입력
        }

        for (int i=n-1 ; i>=0 ; i--){ // 가장 큰 가치의 동전부터 사용하는 for문
            if (k>=a.get(i)){ // 만들고싶은 합이 가지고 있는 i번째 동전 가치보다 크면
                int coin = k/a.get(i); // 현재 동전 가치로 만들 수 있는 동전의 최대 개수
                cnt += coin; // 동전 개수 추가
                k -= coin * a.get(i); // 남은 금액
            }
        }

        bw.write(Integer.toString(cnt)); // 필요한 동전의 최소 개수 출력

        br.close();
        bw.flush();
        bw.close();
    }
}
