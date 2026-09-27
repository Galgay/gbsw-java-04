package coding_test;

public class HaNum {
    public static void main(String[] args) {
        System.out.println(solution(18));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        int num = x;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        return num % sum == 0;
    }
}
