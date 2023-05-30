import java.util.Arrays;
import java.util.Scanner;
public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = s.nextLine(); // 단어는 입력 받는다.

        int abc[] = new int[26]; // 알파벳  배열을 선언.
        Arrays.fill(abc, -1); // 단어에 알파벳이 포함되어있지 않다면 -1을 출력하기위해
        // Arrays.fill 메서드 사용함. (배열 abc의 모든 값을 -1로 초기화)

        for (int i=0 ; i<word.length() ; i++){ // 알파벳 위치를 찾기위한 for문
            char ch = word.charAt(i); // ch 변수에 단어의 i번째 글자를 추출하여 대입.
            int index = ch - 'a'; // int형 변수에 ch형 변수를 대입하면 ASCII 코드 값이 됨.
            // 'a'를 빼서 해당 알파벳의 위치를 변수 index에 대입함

            if (abc[index] == -1){ // 해당 알파벳의 위치가 설정되지 않은 경우에
                abc[index] = i; // 알파벳의 위치를 i로 설정.
            }
        }

        for (int i=0 ; i<abc.length ; i++){ // 알파벳 위치 배열을 출력하기 위한 for문
            System.out.print(abc[i] + " ");
        }
    }
}