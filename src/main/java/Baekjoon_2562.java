import java.util.Scanner;
public class Baekjoon_2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num[] = new int[9]; // 9개의 수를 저장할 배열

        for (int i = 0; i < num.length; i++) { // 배열에 9개 수를 입력하기 위한 for문
            num[i] = s.nextInt();
        }

        int max = num[0]; // 배열의 0번째 값을 최댓값에 대입해둠
        int index = 1; // 최댓값이 몇 번째인지 찾을 변수 1로 초기화

        for (int i = 0; i < num.length; i++) { // 최댓값을 찾기 위한 for문
            if (num[i] > max){ // 배열의 i번째 값이 기존 max값 보다 크면
                max = num[i]; // max 값을 바꾼다.
                index = i+1; // 최댓값이 나타나는 index에 1을 더함
            }
        }

        System.out.println(max); // 최댓값 출력
        System.out.print(index); // 최댓값 몇 번째인지 출력
    }
}
