package String;

import java.util.Scanner;

public class StringInConversion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. 입력받은 문자열을 변수에 저장합니다.
        String conversion = scan.nextLine();

        //2. 공백으로 구분되어 있는 문자열을 분리하여 배열로 저장합니다.
        String[] array = conversion.split(" ");

        //3. 배열의 첫번째 문자열을 변수에 저장합니다.
        String answer = array[0];

        //4. 배열에 저장되어 있는 문자열의 길이 중, 가장 긴 문자를 찾습니다.
        //Note: 길이가 가장 긴 단어가 여러개일 경우는 문장 앞쪽에 위치한 단어를 답으로 한다.
        for (int i = 1; i < array.length; i++) {
            if (answer.length() < array[i].length()) {
                answer = array[i];
            }
        }

        //4. 정답을 출력합니다.
        System.out.println(answer);
    }

}
