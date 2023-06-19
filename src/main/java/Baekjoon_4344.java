import java.io.*;
public class Baekjoon_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);

            int[] scores = new int[n];
            int sum = 0;

            for (int j = 0; j < n; j++) {
                scores[j] = Integer.parseInt(input[j + 1]);
                sum += scores[j];
            }

            double average = (double) sum / n;
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (scores[j] > average) {
                    count++;
                }
            }

            double ratio = (double) count / n * 100;
            System.out.printf("%.3f%%\n", ratio);
        }

        br.close();
    }
}