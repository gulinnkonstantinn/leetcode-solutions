# 242. Valid Anagram

- **Уровень:** easy
- **Паттерн:** подсчёт символов
- **Ссылка:** https://leetcode.com/problems/valid-anagram/

## Краткое условие:
Даны две строки. Вернуть `true` если первая являются анаграммой второй и `false` если нет

## Идея решения:
1. Создать массив длины 26
2. Увеличить счётник индекса каждой буквы первой строки
3. Уменьшить счётчик индекса каждой буквы второй строки
4. Если массив состоит из нулей – строки анаграммы

## Код:
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
```

## Сложность:
- **Время:** O(n)
- **Память:** O(1)