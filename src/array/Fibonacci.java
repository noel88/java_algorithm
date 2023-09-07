package array;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();

        int first = 1;
        int second = 1;
        int result = 1;
        for (int i = 0; i < totalCount; i++) {
            if (i > 1) {
                result = first + second;
            }
            first = second;
            second = result;

            System.out.print(result + " ");
        }
    }
}
