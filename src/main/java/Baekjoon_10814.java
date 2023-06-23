import java.util.*;
class Member implements Comparable<Member> { // Member 클래스 Comparable 인터페이스
    private int age; // 나이 변수 선언
    private String name; /* 이름 변수 선언
    private으로 선언하는 이유 : 정보 은닉과 캡슐화의 원칙*/
    public Member(int age, String name) { /* Member 클래스의 생성자
        생성자 : 클래스에서 객체를 생성할 때 자동으로 호출, 객체의 초기화 담당 */
        this.age = age;
        this.name = name;
    }

    // 변수 선언을 private으로 헤서 해당 클래스가 아닌 외부 클래스에서 변수에 접근하기 위해 getter 메서드 생성
    public int getAge() { // 나이 getter 메서드
        return age; // 해당 메서드를 호출하면 나이를 돌려줌.
    }
    public String getName() { // 이름 getter 메서드
        return name; // 해당 메서드를 호출하면 이름을 돌려줌.
    }

    @Override /* Comparable 인터페이스에서 정의된 compareTo() 메서드 구현
    .sort() 메서드는 정렬을 위해 compareTo 메서드를 호출*/
    public int compareTo(Member other) { // Member 객체와 다른 Member 객체를 비교
        return Integer.compare(this.age, other.getAge());
        // Integer.compare 메서드 : 현재 객체가 다른 객체보다 작으면 음수, 같으면 0, 크면 양수를 반환
    }
}
public class Baekjoon_10814 { // 메인 클래스
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 회원수 n은 입력받음
        List<Member> memberlist = new ArrayList<>(); // Member의 객체를 저장할 리스트

        for (int i = 0; i < n; i++) { // 리스트에 값을 입력 받기위한 for문
            int age = s.nextInt();
            String name = s.next();
            memberlist.add(new Member(age, name)); // Member 생성된 객체 리스트에 추가
        }

        Collections.sort(memberlist); // 나이순으로 정렬

        memberlist.forEach( // 정렬된 회원 정보 출력 (람다식)
                member -> System.out.println
                        (member.getAge() + " " + member.getName()));
    }
}