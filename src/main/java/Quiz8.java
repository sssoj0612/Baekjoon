import java.util.Scanner;
public class Quiz8 {
    public static void main(String[] args) {

        int nums[] = new int[5];
        Scanner s = new Scanner(System.in);

        System.out.print("입력값 : ");

        for (int i = 0; i < nums.length; i++) { //5개의 수를 입력하기 위한 for문
            nums[i] = s.nextInt(); //입력한 수들을 배열에 저장
        }

        System.out.print("출력값 : ");

        for (int i = 0; i < nums.length; i++) { //중복체크를 하기위한 for문
            for (int j = i + 1; j < nums.length; j++) { //배열의 i번째 값 다음으로 입력한 값 j를 i와 같은지 확인하기 위한 for문
                if (nums[i] == nums[j]) { //배열의 i번째 값과 배열의 j번째 값이 같으면 밑행 실행
                    nums[j] = 0; //중복된 값인 배열의 j번째 값에 0을 대입하여 삭제 & 값 출력 안함
                }
            }
            if (nums[i] != 0) { //중복값이 없다면
                System.out.print(nums[i] + " ");//배열에 저장 된 값 출력함
            }
        }
    }
}