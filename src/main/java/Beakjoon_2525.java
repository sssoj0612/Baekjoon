import java.util.Scanner;

public class Beakjoon_2525 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int end_h = 0; //요리가 끝나는 시각의 시
        int end_m = 0; //요리 끝나는 시각의 분

        int hour = s.nextInt(); //현재 시를 입력받음
        int min = s.nextInt(); //현재 분를 입력받음
        int time = s.nextInt(); //요리하는데 필요한 시간(분단위)을 입력받음

        int work_h = time / 60; //요리 하는데 필요한 시간의 시
        int work_m = time % 60; //요리 하는데 필요한 시간의 분

        if ((time % 60) == 0) { //요리 하는 시간이 60으로 나누어 떨어질 때
            end_h = hour + work_h; //최종 시 = 기존 시 + 필요 시
            end_m = min; //최종 분 = 기존 분
        }

        else if ((min + time) < 60) { // 기존 분 + 필요 시간이 60보다 작을 때 (시 올림 필요 없음)
            end_h = hour + work_h; //최종 시 = 기존 시 + 필요 시
            end_m = min + work_m; //최종 분 = 기본 분 + 필요 분
        }

        else if ((min + time) > 60) { // 기존 분 + 필요 분이 60보다 클 때 (시 올림 필요 함)
            end_h = hour + work_h + ((min + work_m) / 60); //최종 시 = 기존 시 + 필요 시 + (기존 분+필요 분을 60으로 나누면 시간이됨)
            end_m = (min + work_m) % 60; //최종 분 = 기본 분에 필요 분을 더하고 60으로 나눈 나머지가 분이 됨.
        }

        if (end_h > 23)  { //만약 최종 시가 23시보다 크면 (24시간이니까)
            end_h = end_h - 24;
        }

        System.out.printf("%d %d", end_h, end_m); // 최종 출력
    }
}
