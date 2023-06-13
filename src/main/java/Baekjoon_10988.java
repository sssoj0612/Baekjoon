import java.util.Scanner;
public class Baekjoon_10988 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();

        if (isPalindrome(word)) {
            System.out.println("1");}

        else {
            System.out.println("0");
        }
    }

    public static boolean isPalindrome(String word){
        int length = word.length();

        for(int i=0 ; i<length/2 ; i++){
            if(word.charAt(i) != word.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}