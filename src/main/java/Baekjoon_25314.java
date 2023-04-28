import java.util.Scanner;
public class Baekjoon_25314 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 4의 배수인 정수는 입력 받는다.

        for(int i=0 ; i<n/4 ; i++){ // long을 추가하기 위한 for문
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
