import java.util.Scanner;

public class Beakjoon_14681 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt(); //사분면에 속하는 x,y의 값은 입력 받는다.
        int y = s.nextInt();

        if (x > 0 && y > 0) { //x=양수, y=양수일 경우
            System.out.println(1); //1사분면
            }

            else if (x < 0 && y > 0) { //x=음수, y=양수일 경우
                System.out.println(2); //2사분면
            }

            else if (x < 0 && y < 0) { //x=음수, y=음수일 경우
                System.out.println(3); //3사분면
            }
            else //x=양수, y=음수일 경우
            System.out.println(4); //4사분면
            }
        }