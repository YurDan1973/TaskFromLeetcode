
package Task_35;

public class Solution_35 {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i - 1]) {
                index = i - 1;
                break;
            } else {
                if (target > nums[i - 1]) {
                    if (target <= nums[i]) {
                        index = i;
                        break;
                    } else {
                        index = i + 1;
                    }
                } else {
                    index = i - 1;
                    break;
                }
            }
        }
        return index;
    }
}


