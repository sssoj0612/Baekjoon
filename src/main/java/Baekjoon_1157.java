import java.util.Scanner;
public class Baekjoon_1157 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String word = s.nextLine().toUpperCase(); // 단어를 입력 받아 대문자로 변환
        int[] count = new int[26]; // 알파벳 개수를 저장할 배열

        // 입력 받은 단어의 각 알파벳 개수를 확인하기위한 for문
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'A';
            count[index]++;
        }

        int max = 0; // 가장 많이 등장한 알파벳 개수
        char result = '?'; // 결과는 '?'로 초기화

        //가장 많이 등장한 알파벳을 확인하기 위한 for문
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) { // 해당 알파벳의 등장수가 max와 같다면
                result = '?'; // ? 출력
            }
        }
        System.out.println(result);
    }
}
