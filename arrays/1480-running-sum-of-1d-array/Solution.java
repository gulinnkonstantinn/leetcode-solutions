// 1480. Running Sum of 1d Array
// Сложность: Easy
// Паттерн: Префиксные суммы
// Ссылка: https://leetcode.com/problems/running-sum-of-1d-array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < ans.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}