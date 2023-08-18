import java.util.Scanner;

public class Baekjoon_2440 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i=0 ; i<n ; i++){ // 줄
            for (int j=0 ; j<n-i ; j++ ){ // 별 개수
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
