import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_30033 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 공부한 일수
        List<Integer> page = new ArrayList<>(); // 공부하고자 계획한 페이지 수
        List<Integer> real = new ArrayList<>(); // 실제 공부한 페이지 수

        StringTokenizer st = new StringTokenizer(br.readLine()); // 공백으로 구분하여 입력
        for (int i=0 ; i<n ; i++) {
            page.add(Integer.parseInt(st.nextToken())); // 계획한 페이지 수 리스트에 추가
        }

        st = new StringTokenizer(br.readLine()); // 공백으로 구분하여 입력
        for (int i=0 ; i<n ; i++) {
            real.add(Integer.parseInt(st.nextToken())); // 실제 공부한 페이지 수 리스트에 추가
        }

        int cnt = 0; // 계획보다 더 많이 공부한 일수

        for (int i=0 ; i<n ; i++){
            if (real.get(i)>= page.get(i)){ // real리스트 값이 page리스트 값 이상이면
                cnt++; // cnt 값 증가시키기
            }
        }

        bw.write(Integer.toString(cnt)); // 출력

        bw.flush();
        bw.close();
        br.close();
    }
}