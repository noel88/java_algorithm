package String;


import java.util.Arrays;
import java.util.Scanner;

public class CaseConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. 문자열을 입력 받는다.
        String val = scan.nextLine();

        //2. 입력받은 문자열을 char Array로 변환한다.
        char[] array = val.toCharArray();

        //3. 문자를 비교하여 대문자는 소문자로, 소문자는 대문자로 변환한다.
        for (int i = 0; i < array.length; i++) {

            if (Character.isUpperCase(array[i])) {
                array[i] = String.valueOf(array[i]).toLowerCase().charAt(0);
            } else {
                array[i] = String.valueOf(array[i]).toUpperCase().charAt(0);
            }
        }

        //4. Array를 문자열로 변환한다
        StringBuilder answer = new StringBuilder();
        for (char x: array) {
            answer.append(x);
        }

        //5. 결과를 출력한다.
        System.out.println(answer);

    }
}
