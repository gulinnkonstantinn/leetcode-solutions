# 1929. Concatenation of Array

- **Уровень:** easy
- **Паттерн:** обход массива
- **Ссылка:** https://leetcode.com/problems/concatenation-of-array

## Краткое условие:
Дан массив nums длины n. Вернуть массив ans длины 2n, в котором
ans[i] == nums[i] и ans[i + n] == nums[i]

## Идея решения:
1. Создать массив длины 2n
2. Скопировать каждый элемент массива nums в две части массива ans
3. Вернуть массив ans

## Код:
```java
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
```

## Сложность:
- **Время:** O(n)
- **Память:** O(n)
