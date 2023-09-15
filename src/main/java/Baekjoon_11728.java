import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Baekjoon_11728 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" "); // 공백으로 구분하여 입력
        int n = Integer.parseInt(input[0]); // 배열 a 크기
        int m = Integer.parseInt(input[1]); // 배열 b 크기

        int[] a = new int[n]; // 배열 a
        int[] b = new int[m]; // 배열 b

        input = br.readLine().split(" "); // 공백으로 구분하여 입력
        for (int i=0 ; i<n ; i++){ // 배열 a 값 입력
            a[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" "); // 공백으로 구분하여 입력
        for (int i=0 ; i<m ; i++){ // 배열 b 값 입력
            b[i] = Integer.parseInt(input[i]);
        }

        HashSet<Integer> list = new HashSet<Integer>(); // 합친 후 중복제거 하기위해 HashSet에 추가

        for (int i=0 ; i<n ; i++){
            list.add(a[i]);
        }

        for (int i=0 ; i<m ; i++){
            list.add(b[i]);
        }

        List<Integer> result = new ArrayList<>(list); // 정렬하기 위해 List로 변경
        Collections.sort(result);

        for (int i : result){ // 출력
            bw.write(i + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
