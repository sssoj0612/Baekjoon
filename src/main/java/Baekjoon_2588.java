import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {

        int a,b;

        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*((b/10)%10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
