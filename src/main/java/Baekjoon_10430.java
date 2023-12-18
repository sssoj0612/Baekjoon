import java.util.Scanner;

public class Baekjoon_10430 {
    public static void main(String[] args) {

        int a,b,c;

        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
