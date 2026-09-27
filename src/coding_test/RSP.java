package coding_test;

import java.util.Scanner;

public class RSP {
    public enum RSPCode {
        R,
        S,
        P
    }
    public static void main(String[] args) {
        // 2개의 문자를 입력받는다.
        Scanner sc = new Scanner(System.in);

        // 0: 가위 1: 바위 2: 보
        // (컴퓨터의 값 - 나의 값 + 3) % 3
        try {
            RSPCode p1 = RSPCode.valueOf(sc.nextLine());
            RSPCode p2 = RSPCode.valueOf(sc.nextLine());

            if (p1 == p2) {
                System.out.println("무승부");
            } else {
                boolean flag1 = p1 == RSPCode.R && p2 == RSPCode.S;
                boolean flag2 = p1 == RSPCode.S && p2 == RSPCode.P;
                boolean flag3 = p1 == RSPCode.P && p2 == RSPCode.R;

                if (flag1 || flag2 || flag3) {
                    System.out.println("A 승");
                } else {
                    System.out.println("B 승");
                }
            }
        } catch (IllegalArgumentException e) {
            // 'R', 'S', 'P' 외의 문자는 예외처리
            System.out.println("Invalid input");
        }
    }
}
