import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Baekjoon_2751 {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>(); // 수를 저장할 List 선언

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); /* 속도를 줄이기 위한 출력 방법 :
        String과 문자열을 더할 때 새로운 객체를 생성하는 것이 아니라 기존의 데이터에 더하는 방식
         -> 속도도 빠르고 상대적으로 부하가 적음 */

        int n = Integer.parseInt(br.readLine()); // 수의 개수 입력 받음

        for (int i=0 ; i<n ; i++){ // 개수만큼 숫자 입력받아
            int nums = Integer.parseInt(br.readLine()); // nums에 숫자 입력받음
            arr.add(nums); // List에 입력 받은 nums 저장
        }

        Collections.sort(arr); // 오름차순 정렬

        arr.forEach(nums -> sb.append(nums).append("\n")); // 람다식 결과 저장
        System.out.println(sb); // 결과 출력
    }
}