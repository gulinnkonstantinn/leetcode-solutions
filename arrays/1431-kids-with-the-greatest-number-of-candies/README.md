# 1431. Kids With the Greatest Number of Candies

- **Уровень:** easy
- **Паттерн:** обход массива
- **Ссылка:** https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

## Краткое условие:
Даны массив из цифр candies и переменная extraCandies от 1 до 50. Если candies[i] + extraCandies больше или равно,
максимальному значению из candies – вернуть true, иначе false

## Идея решения:
1. Определить максимальное значение max из массива candies
2. Пройтись по массиву candies и сравнить сумму значения и extraCandies с max
3. Вернуть массив ans

## Код:
```java
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
```

## Сложность:
- **Время:** O(n)
- **Память:** O(n)