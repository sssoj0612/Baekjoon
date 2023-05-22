import java.util.Scanner;
public class Baekjoon_1546 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 시험 본 과목의 개수
        int jumsu[]=new int[n]; // 성적을 저장할 배열
        int m = jumsu[0]; // 최댓값에 배열의 0번째 값을 저장해둠

        for (int i=0 ; i<n ; i++) { // 성적 중 최댓값을 찾기위한 for문
            jumsu[i] = s.nextInt(); // 점수 입력 받음
            if (jumsu[i] > m) { // i번째 값이 max보다 크면
                m = jumsu[i]; // max에 i번째 값을 대입
            }
        }

            double sum = 0; // 평균을 구하기 위해 선언
            for (int j=0 ; j<n ; j++){ // 점수들을 고치기위한 for문
                double jojak = (double) jumsu[j] / m*100;
                sum += jojak;
            }
            double avg = sum/n; // 조작된 평균 점수 계산

            System.out.print(avg);
        }
    }