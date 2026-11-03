// 217. Contains Duplicate
// Сложность: Easy
// Паттерн: Множество
// Ссылка: https://leetcode.com/problems/contains-duplicate/

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}