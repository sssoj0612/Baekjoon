import java.util.Scanner;
public class Baekjoon_9086 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); // 테스트 개수 입력 받음
        s.nextLine(); // 개행 문자 처리

        for(int i=0 ; i<t ; i++){ // 테스트 개수만큼
        String str = s.nextLine(); // 문자열을 입력 받음
        char first = str.charAt(0); // 첫 번째 글자 추출
        char last = str.charAt(str.length() - 1); // 마지막 글자 추출
            System.out.println(first + "" + last); // 출력
        }
    }
}