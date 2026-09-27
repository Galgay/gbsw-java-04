import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
//        1. 초기값
//        2. 배열의 크기
//        int[] intArray = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArray = new int[n];

        while (n > 0) {
            // n의 초기값 - 현재 n 값
            int index = intArray.length - n;
            intArray[index] = index + 1;
            n--;
        }

        System.out.println(Arrays.toString(intArray));
    }
}
