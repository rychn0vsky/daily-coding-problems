package Problem001;

import java.util.HashSet;
import java.util.Set;

public class Problem001 {
    public static boolean solution(int[] array, int k) {
        int arrLength = array.length;

        for (int i = 0; i <= arrLength; i++) {
            for (int j = 0; j <= arrLength; j++) {
                if (i == j) continue;

                if (array[i] + array[j] == k) return true;
            }
        }

        return false;
    }

    public static boolean solution2(int[] array, int k) {
        if (array == null || array.length < 2) return false;

        Set<Integer> set = new HashSet<>();

        for (int num : array) {
            if (set.contains(k - num)) return true;

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(Problem001.solution2(new int[] {10, 15, 3, 7}, 17));
    }
}
