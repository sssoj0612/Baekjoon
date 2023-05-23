import java.util.Scanner;
public class Baekjoon_27866 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        String S = s.nextLine(); // 문자열 S는 입력받는다
        int i = s.nextInt(); // 문자열 중 몇 번째 글자를 출력할건지 입력받는다
        String str = S.substring(i-1, i); // 문자열 S중 i번째 위치에 있는 문자를 저장

        System.out.print(str); // 저장한 문자를 출력
        }
    }