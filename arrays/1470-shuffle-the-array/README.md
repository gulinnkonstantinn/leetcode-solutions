# 1470. Shuffle the Array

- **Уровень:** easy
- **Паттерн:** обход массива
- **Ссылка:** https://leetcode.com/problems/shuffle-the-array/

## Краткое условие:
Дан массив nums длины 2n, содержащий элементы [x1, x2, ..., xn, y1, y2, ..., yn]
Вернуть массив с элементами [x1, y1, x2, y2, ..., xn, yn]

## Идея решения:
На чётные позиции массива ans записывать элементы из первой половины массива nums.
На нечётные позиции массива ans записывать элементы из второй половины массива nums.

## Код:
```java
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i * 2] = nums[i];
            ans[i * 2 + 1] = nums[i + n];
        }
        return ans;
    }
}
```

## Сложность:
- **Время:** O(n)
- **Память:** O(n)