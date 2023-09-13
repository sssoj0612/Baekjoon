import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon_11399 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 사람의 수
        StringTokenizer st = new StringTokenizer(br.readLine()); // 시간 공백으로 구분해서 입력
        List<Integer> list = new ArrayList<>(); // 시간 저장할 리스트

        for (int i=0 ; i<n ; i++){ // 각 사람이 돈을 인출하는데 걸리는 시간 리스트에 저장하는 for문
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list); // 최솟값으로 구해야하니까 시간이 적은 순으로 정렬

        int time = 0; // 시간 총합
        int wait = 0; // 기다린 시간

        for (int i=0 ; i<n ; i++){ // 시간 총합 구하는 for문
            wait += list.get(i); // 기다린 시간 = 각 사람이 ATM 사용한 시간을 누적
            time += wait; // 시간 총합 = 기다린 시간을 누적
        }

        bw.write(Integer.toString(time));

        bw.flush();
        bw.close();
        br.close();

    }
}
