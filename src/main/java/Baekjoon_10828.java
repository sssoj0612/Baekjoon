import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;
import java.util.Stack;
public class Baekjoon_10828 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cnt = s.nextInt(); // 명령의 수
        s.nextLine(); // 개행문자 제거

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < cnt; i++) { // 명령어 입력 받음
            String[] command = s.nextLine().split(" ");

            switch (command[0]) { // 1번째로 입력 받는 명령어에 따라
                case "push":
                    int x = Integer.parseInt(command[1]);
                    //2번째로 입력 받은 문자열을 int타입으로 형변환하여 변수에 저장
                    stack.push(x); //스택에 x를 추가함
                    break;
                case "pop":
                    if (stack.isEmpty()) { //스택이 비었으면
                        System.out.println(-1); // -1 출력
                    } else { // 스택에 정수가 있으면
                        System.out.println(stack.pop()); // 가장 위에 있는 정수를 빼서 출력
                    }
                    break;
                case "size":
                    System.out.println(stack.size()); // 스택에 몇 개의 정수가 들었는지 출력
                    break;
                case "empty":
                    if (stack.isEmpty()) { // 스택이 비었으면
                        System.out.println(1); // 1 출력
                    } else { // 스택에 정수가 있으면
                        System.out.println(0); // 0 출력
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) { // 스택이 비었으면
                        System.out.println(-1); // -1 출력
                    } else { // 스택에 정수가 있으면
                        System.out.println(stack.peek()); // 가장 위에 있는 정수를 출력
                    }
                    break;
            }
        }
    }
}