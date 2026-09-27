import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicInputHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 키의 수를 입력하세요. : ");
        // 몇 번 입력할지 n 먼저 입력받기
        int n = sc.nextInt();
        sc.nextLine(); // 현재 입력 버퍼에 남은 개행문자 제거
        int[] arr = new int[n];

        // 키를 n번 입력받고, 배열의 0번째부터 저장
        while (n > 0) {
            // n의 초기값 - 현재 n 값
            int index = arr.length - n;
            System.out.print((index + 1) + "번째 키를 입력하세요. : ");
            int height = sc.nextInt();
            sc.nextLine();
            arr[index] = height;
            n--;
        }

        System.out.println("[키 리스트]");
        for (int height : arr) {
            System.out.println(height);
        }

        int sum = 1500;
        int count = 16;
        // 단순 Int형 변수끼리 연산 후 실수형 변수에 대입해도 소수점 계산이 되지 않음.
        // ex) 16/3 = 5.333 이지만, 둘 다 정수형이라면 몫인 5만 저장됨.
        // 이를 실수형으로 변환해도 5.0이 되고 소수점이 복원되지는 않음
        // 피연산자 둘 중 하나, 혹은 둘 다 실수형이어야 실수 연산이 발생해서 소수점도 계산된다.
        double avg = (double) sum / count;

    }
}
