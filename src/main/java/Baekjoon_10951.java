import java.util.Scanner;
public class Baekjoon_10951 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()){ // 반복 횟수를 모르니 while문 사용
            // 입력의 끝을 알 수 없으므로 EOF(End Of File : 파일의 끝을 나타내는 문자)까지 입력 받아야함.
            // 따라서 hasNextInt() 메서드를 사용하여 입력이 끝날 때까지 반복문을 실행.
            // 입력은 Ctrl+D로 종료함.

            int a = s.nextInt(); // a의 값은 입력받는다.
            int b = s.nextInt(); // b의 값은 입력받는다.

            System.out.println(a+b); // a+b의 결과를 출력한다.
        }
    }
}