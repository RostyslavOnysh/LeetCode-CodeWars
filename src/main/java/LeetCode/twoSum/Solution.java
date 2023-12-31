package LeetCode.twoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numIndices = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            numIndices.put(num, index);
            index++;
        }
        index = 0;
        for (int num : nums) {
            int complement = target - num;
            if (numIndices.containsKey(complement) && numIndices.get(complement) != index) {
                return new int[]{index, numIndices.get(complement)};
            }
            index++;
        }
        return null;
    }
}
