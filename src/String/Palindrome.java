package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //1. 문자열을 입력받는다.
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String palindrome = "";

        //2. 받은 문자열을 뒤집는다.
        for (int i = s.length() - 1; i >= 0; i--) {
            palindrome += s.charAt(i);
        }

        //3. 뒤집은 문자와 1번에서 입력받은 문자열과 같은지 확인한뒤 결과를 출력한다.
        if (s.equalsIgnoreCase(palindrome)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
