import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Baekjoon_10101 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] triangle = new int[3];
        int sum = 0;
        String str = null;

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = Integer.parseInt(br.readLine());
            sum += triangle[i];
        }


            if (triangle[0] == 60 && triangle[1] == 60 && triangle[2] == 60) {
                str = "Equilateral";
            } else if (sum == 180) {
                if (triangle[0] == triangle[1] ||
                        triangle[0] == triangle[2] ||
                        triangle[1] == triangle[2]) {
                    str = "Isosceles";
                } else if (triangle[0] != triangle[1] ||
                        triangle[0] != triangle[2] ||
                        triangle[1] != triangle[2]) {
                    str = "Scalene";
                }
            } else {
                str = "Error";
            }
        System.out.println(str);
    }
}