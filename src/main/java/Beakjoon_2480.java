import java.util.Scanner;

public class Beakjoon_2480 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[3]; // 3개의 주사위 눈을 저장할 배열 선언

        for (int i = 0; i < 3; i++) {
            num[i] = s.nextInt(); // 3개의 주사위 눈 입력
        }

        if (num[0] == num[1] && num[1] == num[2]) { // 모두 같은 눈이 나온 경우
            System.out.println(10000 + num[0] * 1000); // 상금 : 10000원 + 같은 눈 * 1000
        }

        else if (num[0] == num[1] || num[0] == num[2] || num[1] == num[2]) // 같은 눈이 2개인 경우
        { int same; // 같은 눈의 값을 임의로 선언하여 경우의 수가 3개니까 그때마다 same에 대입해줌
            if (num[0] == num[1]) {
                same = num[0];
            } else if (num[0] == num[2]) {
                same = num[0];
            } else {
                same = num[1];
            }
            System.out.println(1000 + same * 100); // 상금 : 1000원 + 같은 눈 * 100
        }
        // 모두 다른 눈이 나온 경우
        else {
            int maxNum = Math.max(Math.max(num[0], num[1]), num[2]); // 가장 큰 눈의 값
            System.out.println(maxNum * 100);
        }
    }
}
