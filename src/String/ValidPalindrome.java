package String;

import java.util.Scanner;

public class ValidPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. 받은 문자열을 띄어쓰기로 잘라 배열로 생성한다.
//        String [] arr = scanner.nextLine().split(" ");
        String s = scanner.nextLine();
//        boolean answer = true;

//        int lt = 0;
//        int rt = arr.length -1;
        String regex = "[^\\uAC00-\\uD7A3a-zA-Z]";


        String reverse = new StringBuilder(s.replaceAll(regex, "")).reverse().toString();
        System.out.println(s.replaceAll(regex, "").equalsIgnoreCase(reverse) ? "YES" : "NO");


        //2. 받은 문자열 중에서 특수문자와 숫자를 뺀 나머지 항목을 비교한다.
        //3. 비교시에 문자열을 뒤집어 비교한다.
//        while (lt < rt) {
//            String reverse = new StringBuilder(arr[rt].replaceAll(regex, "")).reverse().toString();
//            if (!arr[lt].replaceAll(regex, "").equalsIgnoreCase(reverse)) {
//                answer = false;
//                break;
//            }
//            lt ++;
//            rt --;
//        }

        //4. 결과를 출력한다.
       // System.out.println(answer ? "YES" : "NO");

    }

}
