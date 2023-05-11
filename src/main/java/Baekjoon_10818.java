import java.util.Scanner;
public class Baekjoon_10818 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // 입력할 정수의 갯수
        int[] num = new int[n]; // 입력할 정수를 저장할 배열

        for (int i=0 ; i<n ; i++){ // 정수 n개를 입력하기 위한 for문
            num[i]=s.nextInt();
        }

        int min = num[0]; // 최소값을 일단 배열 0번째 값으로 초기화
        int max = num[0]; // 최대값을 일단 배열 0번째 값으로 초기화

        for (int i=0 ; i<n ; i++){ // 각 정수를 비교하기 위한 for문
           if (num[i] < min){ // i번째 값이 배열 0번째 값보다 작으면
               min=num[i]; // min에 대입함 (반복)
           }
           if (num[i] > max){ // i번째 값이 배열 0번째 값보다 크면
               max=num[i]; // max에 대입함 (반복)
           }
        }
        System.out.println(min + " " + max); // 최소값과 최대값 출력
    }
}
