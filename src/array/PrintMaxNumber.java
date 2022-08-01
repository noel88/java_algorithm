package array;

import java.util.Arrays;
import java.util.Scanner;

public class PrintMaxNumber {

    //N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        String[] number = scanner.nextLine().split(" ");

        int[] arr = new int[index];

        for (int i = 1; i < index; i++) {
            int compareVal = Integer.parseInt(number[0]);
            arr[0] = compareVal;
            int preVal = Integer.parseInt(number[i - 1]);
            int postVal = Integer.parseInt(number[i]);
            if (preVal < postVal) {
                arr[i] = postVal;
            }
        }

        int[] ints = Arrays.stream(arr)
                .filter(v -> v != 0)
                .toArray();

        for (int x: ints) {
            System.out.print(x + " ");
        }

    }
}
