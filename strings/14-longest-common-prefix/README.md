# (номер задания. название)

- **Уровень:** Easy
- **Паттерн:** Вертикальное сканирование
- **Ссылка:** https://leetcode.com/problems/longest-common-prefix/

## Краткое условие:

Дан массив строк `strs`. Вернуть самый длинный префикс всех строк в массиве. Если его нет, вернуть пустую строку

## Идея решения:

1. Пройтись по каждой строке и каждому символу массива
2. Сравнивать с каждым символом первой строки
3. При обнаружении несовпадения прекращать обход строк
4. Записать символы в `prefix`

## Код:

```java
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
```

## Сложность:

- **Время:** O(n * m), n – количество строк, m – длина самой короткой строки
- **Память:** O(m)
