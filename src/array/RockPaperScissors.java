package array;


//A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
//가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
//두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

//입력
//첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
//두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
//세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

import java.util.Scanner;

//출력
//각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.

public class RockPaperScissors {

    public static String Game(int a, int b) {
        if (a == b) {
            return "D";
        }
        if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
            return "A";
        } else {
            return "B";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int [] a = new int[count];
        int [] b = new int[count];

        for (int i = 0; i < count; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < count; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < count; i++) {
            System.out.println(Game(a[i], b[i]));
        }
    }
}
