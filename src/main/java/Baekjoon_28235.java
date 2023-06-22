import java.util.Scanner;
public class Baekjoon_28235 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String slogan = scanner.nextLine();
        cheer(slogan);
    }

    public static void cheer(String slogan){

        String cheer = "";

        if (slogan.equals("SONGDO")) {
            cheer = "HIGHSCHOOL";
        } else if (slogan.equals("CODE")) {
            cheer = "MASTER";
        } else if (slogan.equals("2023")) {
            cheer = "0611";
        } else if (slogan.equals("ALGORITHM")) {
            cheer = "CONTEST";
        }

        System.out.println(cheer);
    }
}

