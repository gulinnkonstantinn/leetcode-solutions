// 1672. Richest Customer Wealth
// Сложность: Easy
// Паттерн: Обход массива
// Ссылка: https://leetcode.com/problems/richest-customer-wealth/


class Solution {
    public int maximumWealth(int[][] accounts) {
        int currnetSum = 0;
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                currentSum += accounts[i][j];
            }
            if (currnetSum > maxWealth) {
                maxWealth = currnetSum;
            }
            currnetSum = 0;
        }

        return maxWealth;
    }
}