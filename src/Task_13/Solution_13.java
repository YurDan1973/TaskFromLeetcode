package Task_13;

import java.util.HashMap;
import java.util.Map;

public class Solution_13 {
    public static int romanToInt(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int currentValue = map.get(str.charAt(i));

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }
}
