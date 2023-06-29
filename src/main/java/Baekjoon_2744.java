import java.util.Scanner;

public class Baekjoon_2744 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine(); // 단어 입력 받음
        StringBuilder result = new StringBuilder(); // 결과값 출력할 변수

        for (int i=0 ; i<word.length() ; i++){
            char c = word.charAt(i); // 단어의 i번째 글자

            if (Character.isUpperCase(c)){ // i번째 글자가 대문자라면
                result.append(Character.toLowerCase(c)); // 결과값에 소문자로 변경한 글자 추가
            } else if (Character.isLowerCase(c)) { // i번째 글자가 소문자라면
                result.append(Character.toUpperCase(c)); // 결과값에 대문자로 변경한 글자 추가
            } else {
                result.append(c);
            }
            }
        System.out.print(result.toString()); // 결과값 문자열로 변환후 출력
        }
    }