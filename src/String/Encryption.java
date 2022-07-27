package String;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String code = scanner.nextLine();


        //code를 분할하여 배열로 저장한다.

        StringBuilder answer = new StringBuilder();
        int cnt = 0;

        for (int i = 7; i <= count*7;  i += 7) {
            answer.append(decryption(code.substring(cnt, i).toCharArray()));
            cnt = i;
        }
        System.out.println(answer);

    }


    // # -> 1, * -> 0 변환 후, 만들어진 2진수를 10진수로 변환한다.
    static char decryption(char [] encryptionArr) {
        StringBuilder toDecryption = new StringBuilder();

        for (char ch : encryptionArr) {
            if (ch == '#') {
                toDecryption.append("1");
            } else if (ch == '*') {
                toDecryption.append("0");
            }
        }

        int decimal = Integer.valueOf(toDecryption.toString(), 2);
        return (char) decimal;
    }
}
