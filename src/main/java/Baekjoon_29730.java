import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Baekjoon_29730 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 공부 개수
        List<String> list = new ArrayList<>(); // 공부 기록 저장할 리스트
        String cnt;

        for(int i=0 ; i<n ; i++){ // 공부 기록 저장하는 for문
            list.add(br.readLine());
        }

        for(int i=1 ; i<n-1 ; i++){
            if (list.get(i).length() < list.get(i-1).length()){
                cnt = list.get(i-1);
                list.get(i-1) = list.get(i);
                list.get(i)
            }

        }



    }
}
