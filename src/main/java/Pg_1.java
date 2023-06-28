import java.util.Scanner;
public class Pg_1 {

        public static int solution(int[] array, int height) {
            int answer = 0;
            for (int i=0 ; i<array.length ; i++){
                if (array[i]>height){
                    answer++;
                }
            }
            return answer;
        }

    public static void main(String[] args) {

        int height=167;
        int[] array = {49,180,192,170};
        int answer = solution(array, height);
        System.out.println(answer);
    }
}