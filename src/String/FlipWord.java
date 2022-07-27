package String;

import java.util.Scanner;

public class FlipWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. 첫번쨰 줄에 자연수를 입력합니다.
        int num = scanner.nextInt();

        String arr[] = new String[num+1];

        //2. 두번째 줄부터 입력한 자연수 만큼의 줄로 단어를 입력합니다.
        for (int i = 0; i <= num; i++) {
            arr[i] = scanner.nextLine();
        }

        int index = 0;
        //3. 받은 단어를 뒤집어서 저장합니다.
        for (String s: arr) {
            String reverse = "";
            for (int i = s.length(); i > 0; i--) {
                reverse += s.charAt(i-1);
            }
            arr[index] = reverse;
            index ++;
        }

        //4. 뒤집은 단어를 출력합니다.
        for (String s: arr) {
            if (!s.isEmpty()) {
                System.out.println(s);
            }
        }

    }
}
