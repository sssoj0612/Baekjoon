import java.util.HashSet;
import java.util.Scanner;
public class Baekjoon_3052 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num[] = new int[10]; // 수 10개를 저장할 배열
        HashSet<Integer> namugi = new HashSet<Integer>();
        // 나머지를 저장할 배열 (중복값은 허용 X)

        for (int i=0 ; i< num.length ; i++){ // 수 10개를 입력할 for문
            num[i] = s.nextInt();

            namugi.add(num[i] % 42); // 입력한 수를 42로 나눈 나머지를 배열에 저장
        }
        System.out.print(namugi.size()); // namugi에 있는 수가 몇 개인지 출력
    }
}
