import java.util.Scanner;
public class Quiz9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int nums[] = new int[5]; // 5개의 수를 저장할 배열 선언

        System.out.print("입력값 : ");

        for (int i = 0; i < nums.length; i++) { // 1번 반복문 (숫자 5개 입력을 위한)
            // 1. 입력 받는 수의 순번 i의 값을 0으로 초기화
            // 2. i가 배열의 길이인 5보다 작을 때 밑행 실행
            // 3. 밑행 실행 끝나면 i의 값 증가 후 2로 돌아가 반복

            int num = s.nextInt(); // 값은 입력 받는다.

            nums[i] = num; // 입력 받은 숫자를 배열에 저장
        }

        for (int i = 0; i < nums.length - 1; i++) { // 2번 반복문 (내림차순 정렬을 위한)
            // 1. i는 비교할 수, 0으로 초기화
            // 2. 총 5개의 입력한 숫자 중 첫 번째 수랑 4번 비교할거니까 i<5-1로 조건을 줌
            // 3. 밑행 실행 후 i 증가 후 2로 돌아가 조건이 틀릴때까지 반복

            for (int j = 0; j < nums.length - i - 1; j++) {
                // 3번 반복문(첫 번째 수를 제외한 나머지 중 i까지 정렬 됐으니 i 이후 수들을 비교하기 위한)
                // 1. j는 i 이후 수
                // 2. j가 5개의 수 중 정렬 된 i와 본인을 뺀 수 보다 작을 때
                // 3. 밑행 실행 후 j 증가 후 2로 돌아가 조건이 틀릴때까지 반복

                if (nums[j] < nums[j + 1]) { //j번째 수랑 그 다음 j+1을 비교하여 j가 더 작으면
                    int k = nums[j]; //서로 바꾸기 위해 임의로 변수를 만들어 그 자리에 j번째 수 저장
                    nums[j] = nums[j + 1]; //j번째 수 자리에 j+1번째 수를 저장
                    nums[j + 1] = k; //k에 저장 되어있던 j번째 수를 j+1에 저장
                }
            }
        }
        System.out.print("결과값 : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}

