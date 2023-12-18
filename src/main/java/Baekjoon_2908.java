import java.util.Scanner;
public class Baekjoon_2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int ra = reverseNumber(a);
        int rb = reverseNumber(b);

        int result = Math.max(ra,rb);

        System.out.print(result);
    }

    private static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0){
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        return reversedNum;
    }
}
