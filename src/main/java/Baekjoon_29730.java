import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baekjoon_29730 {

    // 비교하는 메서드 구현하기 위해 클래스 생성
    public static class StudyRecord implements Comparable<StudyRecord> {
        String record;

        public StudyRecord(String record) { // StudyRecord 객체를 생성할 때 기록을 받아옴
            this.record = record;
        }

        @Override
        public int compareTo(StudyRecord other) { // 비교하는 메서드 (리턴값에 따라 정렬)
            if (record.contains("boj.kr/")) { // 1. 기록이 백준 문제라면
                if (other.record.contains("boj.kr/")) { // 다른 기록도 백준 문제라면
                    int num1 = Integer.parseInt(record.substring // 링크 뒤 번호 추출해서 비교
                            (record.indexOf("boj.kr/") + 7));
                    int num2 = Integer.parseInt(other.record.substring
                            (other.record.indexOf("boj.kr/") + 7));
                    return num1 - num2;
                } else {
                    return 1; // 백준 문제는 마지막에 출력 되어야해서 다른 기록이 있으면 뒤로 보냄
                }
            } else if (other.record.contains("boj.kr/")) { // 백준 문제라면 앞으로 보냄
                    return -1;
                } else { // 다른 기록이라면
                if (record.length() != other.record.length()) { // 문자열 길이 비교해서
                    return record.length() - other.record.length(); // 길이가 짧은 순서대로 정렬
                } else{ // 길이가 같다면 사전순으로 정렬
                    return record.compareTo(other.record);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 공부 개수
        List<StudyRecord> list = new ArrayList<>(); // 공부 기록 저장할 리스트

        for (int i = 0; i < n; i++) { // 공부 기록 저장하는 for문
            String record = br.readLine(); // String 변수에 입력 받고
            list.add(new StudyRecord(record)); // 리스트에 저장
        }

        Collections.sort(list); // 리스트를 위에 구현한 비교 메서드에 맞게 정렬

        for (StudyRecord record : list) { // 출력하는 for문
            bw.write(record.record + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}