# 125. Valid Palindrome

- **Уровень:** easy
- **Паттерн:** два указателя
- **Ссылка:** https://leetcode.com/problems/valid-palindrome/

## Краткое условие:
Дана строка `s`, проверить является ли она палиндромом

## Идея решения:
1. Создать левый указатель с начала строки и правый с конца строки
2. Если встречается специальный символ, сдвинуть указатель ближе к центру
3. Если символ на позиции левого указателя не равен символу на позиции правого – вернуть `false`
4. Продолжать сдвигать указатели, пока не дойдут до центра

## Код:
```java
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

## Сложность:
- **Время:** O(n)
- **Память:** O(1)
