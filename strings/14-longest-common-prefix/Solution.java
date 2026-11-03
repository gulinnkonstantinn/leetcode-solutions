// 14. Longest Common Prefix
// Сложность: Easy
// Паттерн: Два указателя
// Ссылка: https://leetcode.com/problems/longest-common-prefix/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minLength = 999;
        boolean coincidence = false;
        String prefix = "";

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            coincidence = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    coincidence = false;
                    break;
                }
            }
            if (!coincidence) {
                break;
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}