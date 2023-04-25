import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int star = s.nextInt(); //별을 출력할 행의 갯수는 입력 받음.


        for (int i = 1; i <= star; i++) { // 1. 행 넘기기 위한 for문 (i는 행,별만큼 행 출력)
            for (int j = 1; j <= star - i; j++) { // 2. 공백 찍기 위한 for문
                // (j는 공백, 최종 별보다 각 행 만큼 작아짐)
                System.out.print(" "); // 공백 갯수 만족하면 아래 for문으로 넘어감.
            }
            for (int k = 0; k < i; k++) { // 3. 별 찍기 위한 for문
                System.out.print("*");
            }
            System.out.println(); // 다음 행 출력을 위한 줄바꿈
        }
    }
}