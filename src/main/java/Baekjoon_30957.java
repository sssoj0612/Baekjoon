import java.util.Scanner;

public class Baekjoon_30957 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        int[] cnt = new int[3];

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (ch == 'B') {
                cnt[0]++;
            } else if (ch == 'S') {
                cnt[1]++;
            } else {
                cnt[2]++;
            }
        }

        if (cnt[0] > cnt[1] && cnt[0] > cnt[2]) {
            System.out.print("B");
        } else if (cnt[1] > cnt[0] && cnt[1] > cnt[2]) {
            System.out.print("S");
        } else if (cnt[2] > cnt[0] && cnt[2] > cnt[1]) {
            System.out.print("A");
        } else if (cnt[0] > cnt[1] && cnt[0] == cnt[2]) {
            System.out.print("BA");
        } else if (cnt[0] > cnt[2] && cnt[0] == cnt[1]) {
            System.out.print("BS");
        } else if (cnt[1] > cnt[0] && cnt[1] == cnt[2]) {
            System.out.print("SA");
        } else {
            System.out.print("SCU");
        }
    }
}