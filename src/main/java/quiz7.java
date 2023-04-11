import java.util.Scanner;

public class quiz7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int nums[] = new int[5]; // 5개의 수를 저장할 배열

        for (int i = 0; i < nums.length; i++) { // 1. 반복문 (숫자 5개 입력을 위한)

            System.out.printf("%d번째 값 입력 : ", i + 1);
            nums[i] = s.nextInt(); // 입력 받은 값을 배열에 저장
        }

        int max = nums[0]; // 배열의 첫 번째 값으로 최대값을 초기화
        int min = nums[0]; // 배열의 첫 번째 값으로 최소값을 초기화
        int sum = 0; // 평균값을 구하기 위해 배열의 총합을 저장하기 위한 변수
        int average = 0; // 평균값을 저장하기 위한 변수

        for (int i = 1; i < nums.length; i++) { // 2. 반복문 (최대값,최소값을 구하기 위한)
            if (nums[i] > max) { // 최댓값 구하기 : nums[1] > nums[0] 참이면
                max = nums[i]; // max에 nums[1] 값을 저장 후 for문으로 돌아가 i 증감시키고 조건문부터 반복
            } else if (nums[i] < min) { // 위 조건문이 끝나면 최소값 구하기 : 위와 동일
                min = nums[i];
            }
        }
        System.out.printf("최대값 : %d\n", max);
        System.out.printf("최소값 : %d\n", min);

        for (int i = 0; i < nums.length; i++) { // 3. 반복문 (평균값을 구하기 위한)
            sum += nums[i]; // 배열의 합계 구하기
        }
        average = sum / nums.length; // 평균값은 합계를 배열의 길이로 나누면 됨.(소수가 나올수 있으니 형변환)

        System.out.printf("평균값 : %d\n", average);
    }
}
