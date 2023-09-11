import java.io.*;
import java.util.*;
public class Beakjoon_2750 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = new Integer(br.readLine()); // 입력 할 숫자 개수
        Set<Integer> list = new HashSet<>(); // 숫자 저장 할 리스트 (중복x)

        for (int i=0 ; i<n ; i++){ // 숫자 입력하는 for문
            int num = new Integer(br.readLine());
            list.add(num);
        }

        Integer[] sort = list.toArray(new Integer[0]); // HashSet을 정렬된 배열로 변환
        Arrays.sort(sort);

        for (Integer num : sort) {
            bw.write(num + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
