package LeetCode.task_167_Two_Sum_II_Input_Array_Is_Sorted;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
