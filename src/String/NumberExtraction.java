package String;

import java.util.Scanner;

public class NumberExtraction {

    public static void main(String[] args) {

        //Note 1. 문자열을 입력받는다.
        Scanner scanner = new Scanner(System.in);

        char [] chars = scanner.nextLine().toCharArray();
        StringBuilder string = new StringBuilder();

        //Note 2. 문자열을 Char Type의 배열로 변경한 후, 숫자의 값만 StringBuilder로 저장한다.
        for(char c: chars) {
            if (Character.isDigit(c)) {
                string.append(c);
            }
        }

        //Note 3. 문자열을 숫자로 바꾼 후 출력한다.
        System.out.println(Integer.parseInt(string.toString()));
    }

}
