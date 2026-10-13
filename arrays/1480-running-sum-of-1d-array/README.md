# 1480. Running Sum of 1d Array

- **Уровень:** easy
- **Паттерн:** префиксные суммы
- **Ссылка:** https://leetcode.com/problems/running-sum-of-1d-array

## Краткое условие:
Дан массив nums длины n. Найти текущую сумму массива как runningSum[i] = sum(nums[0]...nums[i])

## Идея решения:
1. Создать новый массив и пустую переменную sum для накопления суммы
2. Накапливать сумму из массива nums и записывать её в новый массив
3. Вернуть новый массив

## Код:
```java
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < ans.length; i++) {
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
```

## Сложность
- **Время:** O(n)
- **Память:** O(n)