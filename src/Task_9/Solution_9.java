package Task_9;

public class Solution_9 {
    public static boolean isPalindrome(int y) {
        if (y < 0) {
            return false;
        }
        int reverse = 0;
        int ycopy = y;
        while (y > 0) {
            reverse = (reverse * 10) + (y % 10);
            y /= 10;
        }
        return reverse == ycopy;
    }
}
