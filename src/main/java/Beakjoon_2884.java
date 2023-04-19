import java.util.Scanner;
public class Beakjoon_2884 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt(); //현재 시간의 시
        int m = s.nextInt(); //현재 시간의 분

        int alarm_h, alarm_m; //맞춰야할 알람 시각의 시,분

        if (m < 45) {  //현재 분이 45보다 작으면 시간을 내림 해기위한 if문

            if (h == 0) { //현재 시가 0이라면
                alarm_h = 23; //0시 - 1시간을 시의 형태인 23시가 나오게 출력해야함
                alarm_m = m + 15; //현재 분에서 45분을 빼면 -가 나오니까 분의 형태를 맞추기 위해 15분을 더함
                System.out.print(alarm_h + " " + alarm_m);
            } else { //현재 시가 0이 아니라면
                alarm_h = h - 1; //그냥 현재 시에서 1을 빼주면 됨
                alarm_m = m + 15; //위와 동일
                System.out.print(alarm_h + " " + alarm_m);
            }
        }
            else {//현재 분이 45보다 크면
                alarm_m = m - 45;//시는 냅두고 분에서 45만 빼주면 됨
                System.out.print(h + " " + alarm_m);
            }
        }
    }