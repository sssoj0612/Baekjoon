import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
public class Baekjoon_1181 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 입력할 단어 개수
        HashSet<String> wordSet = new HashSet<>(); // 중복 단어 제거를 위한 HashSet
        ArrayList<String> words = new ArrayList<>(); // 정렬된 단어를 저장할 리스트

        for (int i = 0; i < n; i++) { // 단어 입력하기 위한 for문
            String input = br.readLine();
            wordSet.add(input);
        }

        words.addAll(wordSet); // HashSet의 저장된거 ArrayList로 옮김

        // 정렬을 위한 Comparator
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) { // 길이가 같으면 사전 순으로
                    return s1.compareTo(s2);
                }
                return Integer.compare(s1.length(), s2.length()); // 길이가 짧은 순으로
            }
        });

        for (String word : words) { // 정렬 된 단어 출력
            bw.write(word);
            bw.newLine();
        }

        br.close();
        bw.close();
    }
}