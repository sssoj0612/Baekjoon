import java.util.Scanner;
public class Baekjoon_2908 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                int reversedA = reverseNumber(a);
                int reversedB = reverseNumber(b);

                int result = Math.max(reversedA, reversedB);

                System.out.println(result);
            }

            public static int reverseNumber(int num) {
                int reversedNum = 0;

                while (num != 0) {
                    reversedNum = reversedNum * 10 + num % 10;
                    num /= 10;
                }

                return reversedNum;
            }
}
