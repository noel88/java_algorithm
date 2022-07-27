package String;

import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine() + " ";
        StringBuilder answer = new StringBuilder();

        int cnt = 1;
        for (int i = 0; i < s.length() -1; i++) {
            if (s.indexOf(s.charAt(i)) == s.indexOf(s.charAt(i + 1))) {
                cnt ++;
            } else {
                answer.append(s.charAt(i));
                if (cnt != 1) {
                    answer.append(cnt);
                }
                cnt = 1;
            }
        }
        System.out.println(answer);

    }
}
