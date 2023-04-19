package Problem002;

import java.util.Arrays;

public class Problem002 {

    public static int[] solution(int[] arr) {
        if (arr == null || arr.length < 2) return null;

        int[] outArr = new int[arr.length];
        int product = 1;

        for (int num : arr) {
            product *= num;
        }

        for (int i = 0; i < arr.length; i++) {
            outArr[i] = product / arr[i];
        }

        return outArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[] {1})));
    }
}
