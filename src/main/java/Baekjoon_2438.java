import java.util.Scanner;

public class Baekjoon_2438 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //별 몇 줄 출력 할건지 입력 받음.

        for(int i=0 ; i<n ; i++){ // 1. i=행의 순번, 0으로 초깃값
                                // 2. n만큼 행 출력할거니까 i가 n보다 작을 때를 조건
                               // 3. 조건이 맞을 때까지 밑행 실행 후 i 증가
            for(int k=0 ; k<=i ; k++){ // k=별의 개수, 별이 늘어나는 for문
                                      // 1. 별의 개수는 0으로 초깃값
                                     // 2. 행의 순번과 동일한 개수니까 k는 i 이하를 조건
                                    // 3. 조건이 맞을 때까지 밑행 실행 후 k 증가
                System.out.printf("*"); //별 찍음
            }
            System.out.println(); //별의 개수를 만족했으면 다음 행으로 넘어가야하니 줄바꿈
        }
    }
}
