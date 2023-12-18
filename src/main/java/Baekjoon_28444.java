import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon_28444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer nums = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(nums.nextToken());
        int i = Integer.parseInt(nums.nextToken());
        int a = Integer.parseInt(nums.nextToken());
        int r = Integer.parseInt(nums.nextToken());
        int c = Integer.parseInt(nums.nextToken());

        bw.write( Integer.toString((h*i) - (a*r*c)) );
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();

    }
}