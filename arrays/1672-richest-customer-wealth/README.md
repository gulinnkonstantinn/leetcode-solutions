# 1672. Richest Customer Wealth

- **Уровень:** easy
- **Паттерн:** обход массива
- **Ссылка:** https://leetcode.com/problems/richest-customer-wealth/

## Краткое условие:
Дан массив accounts[m][n]. M – клиент, n – банк. Найти самого богатого клиента банка 

## Идея решения:
1. Пройтись циклом по массиву
2. Накопить сумму [m][n] и записать её
3. Перезаписать сумму в отдельную переменную
4. Сравнивать переменную с суммой
5. Вывести наибольшее значение

## Код:
```java
class Solution {
    public int maximumWealth(int[][] accounts) {
        int currnetSum = 0;
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                currentSum += accounts[i][j];
            }
            if (currnetSum > maxWealth) {
                maxWealth = currnetSum;
            }
            currnetSum = 0;
        }

        return maxWealth;
    }
}
```

## Сложность:
- **Время:** O(m * n)
- **Память:** O(1)