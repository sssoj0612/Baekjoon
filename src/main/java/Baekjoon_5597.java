import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Baekjoon_5597 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Set<Integer> submited = new HashSet<>(); // 과제 제출 여부를 저장할 배열

        for (int i=0 ; i<28 ; i++){ // 제출한 학생 번호 입력하기 위한 for문
        int student = s.nextInt();
        submited.add(student); // submited 배열에 입력한 student를 저장한다.
        }

        Set<Integer> all = new HashSet<>(); // 모든 학생 번호를 저장할 배열
        for (int i=1 ; i<31 ; i++){
            all.add(i); // all 배열에 1~30번의 학생 번호를 저장.
        }

        Set<Integer> absent = new HashSet<>(all); // 미제출한 학생 번호를 저장할 배열
        absent.removeAll(submited); // 기존 all 배열에서 submited 배열의 값을 제거

        for (int student : absent){ // 미제출한 학생 번호 출력
            System.out.println(student);
        }
    }
}