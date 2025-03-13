package Task_1;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {
    public static int[] twoSum(int[] B, int m) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = B.length;

        for (int i = 0; i < n; i++) {
            int complement = m - B[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(B[i], i);
        }

        return new int[]{}; // No solution found
    }
}
