import java.util.Scanner;
public class Baekjoon_11022 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int t = s.nextInt(); //테스트 케이스의 개수를 입력 받음.

        for(int i=1 ; i<=t ; i++)
        { //테스트 개수만큼 입력 받는 for문
            int a = s.nextInt(); // 숫자 a는 입력 받음.
            int b = s.nextInt(); // 숫자 b는 입력 받음.
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }
    }
}
