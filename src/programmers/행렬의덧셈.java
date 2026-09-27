package programmers;

import java.util.Arrays;

public class 행렬의덧셈 {
    public static void main(String[] args) {

        int[][] arr = new int[][] {new int[] {1,2},new int[] {2,3}};
        int[][] arr2 = new int[][] {new int[] {3,4},new int[] {5,6}};

        System.out.println(Arrays.deepToString(solution(arr, arr2)));
//        System.out.println(Arrays.deepToString(arr));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
//        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
//                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return arr1;
    }
}
