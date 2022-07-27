package String;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char t = scanner.next().charAt(0);

        int [] answer = new int[s.length()];

        //최대 거리를 잡음.
        int p = 1000;

        // t 와 왼쪽으로 부터 떨어진 거리를 계산한다.
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p ++;
            }
            answer[i] = p;
        }

        p = 1000;

        // t 와 오른쪽으로 부터 떨어진 거리를 계산한다.
        // 계산 후 가장 작은 수를 배열에 넣는다.
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                p = 0;
            } else {
                p ++;
                answer[i] = Math.min(answer[i], p);
            }
        }


        for (int i: answer) {
            System.out.print(i + " ");
        }
    }
}
