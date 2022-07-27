package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ReverseSpecificChar {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //1. 문자열을 입력 받습니다.
        String conversion = scan.nextLine();

        //2. 입력받은 문자를 Char Type의 배열에 저장합니다.
        char [] chars = conversion.toCharArray();

        //3. 입력받은 문자 중에 특수문자는 그대로 두고 알파벳만 순서를 뒤집는다.
        //a#b!S -> S#b!a
        //kdj#@kdjg - > gjd#@kjdk
        Pattern pattern = Pattern.compile("\\W");
        //String [] answer = new String[chars.length];

        String tmp;
        int lt = 0;
        int rt = conversion.length() - 1;

        while (lt < rt) {
            if (pattern.matcher(String.valueOf(chars[lt])).find()) {
                lt ++;
            } else if (pattern.matcher(String.valueOf(chars[rt])).find()) {
                rt --;
            } else {
                tmp = String.valueOf(chars[lt]);
                chars[lt] = chars[rt];
                chars[rt] = tmp.charAt(0);
                lt ++;
                rt --;
            }
        }

//        for (int i = 0; i < chars.length; i ++) {
//            if (pattern.matcher(String.valueOf(chars[i])).find()) {
//                if (answer[chars.length - 1 - i] == null) {
//                    answer[chars.length - 1 - i] = String.valueOf(chars[i]);
//                    //System.out.println("pattern string: " + chars[i]);
//                } else {
//                    answer[i] = String.valueOf(chars[i]);
//                    //System.out.println("pattern string not null index: " + chars[i]);
//                }
//            } else {
//                answer[i] = String.valueOf(chars[i]);
//                //System.out.println("pattern not string: " + chars[i]);
//            }
//            System.out.println("pattern: " + answer[i]);
//        }

        //4. 결과를 출력합니다.
        for (char x : chars) {
            System.out.print(x);
        }


    }
}
