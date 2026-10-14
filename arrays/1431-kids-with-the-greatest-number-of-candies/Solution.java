// 1431. Kids With the Greatest Number of Candies
// Сложность: Easy
// Паттерн: Обход массива
// Ссылка: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = 0;
        for (int c : candies) {
            max = Math.max(max, c);
        }

        for (int c : candies) {
            ans.add(c + extraCandies >= max);
        }

        return ans;
    }
}