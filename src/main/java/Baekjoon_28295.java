import java.util.Scanner;
public class Baekjoon_28295 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] t =new int[10];
        char[] directions = {'N', 'E', 'S', 'W'};
        int result=0;

        for (int i=0 ; i<10 ; i++){
            t[i] = s.nextInt();
            switch (t[i]){
                case 1:
                    result=(result+1)%4;
                    break;

                case 2:
                    result=(result+2)%4;
                    break;

                case 3:
                    result=(result+3)%4;
                    break;

                default:
                    System.out.print("1,2,3 중 하나를 입력하시오.");
                    break;
                }
            }

        System.out.print(directions[result]);

        }
    }