package String;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String answer = "";

        //중복 문자가 있으면 제거한다
        for(int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }

        System.out.println(answer);

    }
}
