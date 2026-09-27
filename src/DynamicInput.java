import java.util.Scanner;

public class DynamicInput {
    public static void main(String[] args) {
//        1. 초기값
//        2. 배열의 크기
//        int[] intArray = {1,2,3,4,5};

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 수를 입력하세요. : ");
        int n = sc.nextInt(); // 입력받을 이름의 개수
        // nextInt 이후에 버퍼에는 개행문자가 남아있다.
        // 이후 추가 입력 과정에서 문제가 발생하지 않도록 nextLine 호출 (현재 입력 버퍼에 남은 개행문자 제거)
        sc.nextLine();
        String[] arr = new String[n];

        // 이름을 n번 입력받고, 배열의 0번째부터 저장
        while (n > 0) {
            // n의 초기값 - 현재 n 값
            int index = arr.length - n;
            System.out.print((index + 1) + "번째 이름을 입력하세요. : ");
            String name = sc.nextLine();
            arr[index] = name;
            n--;
        }
        System.out.println("[이름 리스트]");
        for (String name : arr) {
            System.out.println(name);
        }
    }
}
