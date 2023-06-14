import java.util.Scanner;
public class Baekjoon_2941 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String word = s.next(); // 단어를 입력받는다.

        // 크로아티아 알파벳 목록을 배열로 선언
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String alphabet : croatia){ /*for Each반복문 -> croatia 배열을 순회하면서
            입력한 단어의 문자가 크로아티아 알파벳이면 *로 변경한다.*/
            word = word.replace(alphabet, "*");
        }
        System.out.print(word.length()); // 변경된 단어의 길이 = 크로아티아 알파벳 개수
    }
}