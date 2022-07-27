package String;

import java.util.Scanner;

public class FindString {

    public static void main(String[] args) {
        
        //1. scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        //2. 저장할 변수 선언
        String firstLineStrings;
        //Note: 문자 하나만 받을 것이므로 String 보단 char Type이 적합합니다.
        //String secondLineString;
        char secondLineChar;
        int containsChar = 0;

        //Note: 문자의 배열이므로 String 배열보다 Char type의 배열이 적합합니다.
        //String[] arrString = new String[100];
        char[] arr = new char[100];

        //3. scanner 의 첫번재 줄 받음
        firstLineStrings = scan.nextLine();

        //4. scanner 의 두번째 줄 받음
        //Note: 분기처리하지 않고 char Type으로 받을 수 있게 코드를 작성한다.
        //if (scan.hasNext()) {
        //    secondLineString = scan.nextLine();
        //}
        secondLineChar = scan.nextLine().charAt(0);

        //5. 3번의 항목에서 받은 문자열을 배열에 넣어줌.
        //Note: String.toCharArray()로 배열을 생성할 수 있다.
        // 배열 생성시 대소문자를 무시할 수 있게 소문자로 맞추어 생성할 수 있도록 한다
        //for (int i = 0; i < firstLineStrings.length(); i++) {
        //    arrString[i] = String.valueOf(firstLineStrings.charAt(i));
        //}
        arr = firstLineStrings.toLowerCase().toCharArray();

        //6. 배열에 넣어준 문자열을 대소문자 구분없이 4번에서 받은 문자가 있는지 찾아서 카운트.
        //for (int i = 0; i < firstLineStrings.length(); i++) {
        //    if (arrString[i].equalsIgnoreCase(secondLineString)) {
        //        containsChar ++;
        //    }
        //}
        for (char x : arr) {
            if (x == secondLineChar) { containsChar ++; }
        }

        //7. 결과 출력
        System.out.println(containsChar);

    }

}
