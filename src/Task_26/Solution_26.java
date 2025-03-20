package Task_26;

import java.util.ArrayList;
import java.util.List;

public class Solution_26 {
    public static int removeDuplicates(int[] nums) {
//    public static void main(String[] args) {
//        int[] nums = {1,1,2};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= nums.length - 1; i++) {
            if ((i + 1) < nums.length && nums[i] == nums[i + 1]) {
                continue;
            }
            list.add(nums[i]);
        }

        return list.size();
//        System.out.println(list.size());
//        System.out.println(list);
    }
}
