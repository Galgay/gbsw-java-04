import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ScanExample {
    public static void main(String[] args) throws IOException {
        int charCode;
        while(true) {
             charCode = System.in.read();
            if (charCode == 113) {
                break;
            }
            System.out.println("입력된 문자: " + (char) charCode);
        }

        while(true) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (input.equals("q")) {
                break;
            }
            System.out.println("입력된 문자열: " + input);
        }

        int[] intArr = {1,2,3};
        for (int elem: intArr) {
            System.out.println(elem);
        }

        Arrays.copyOf(intArr,intArr.length+1);//

    }
}
