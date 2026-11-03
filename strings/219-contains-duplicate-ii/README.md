# 219. Contains Duplicate II

- **Уровень:** Easy
- **Паттерн:** HashMap
- **Ссылка:** https://leetcode.com/problems/contains-duplicate-ii/

## Краткое условие:

Дан массив `nums` и переменная `k`. Вернуть `true`, если существует дубликат в пределах расстояния `k`.

## Идея решения:

1. Пройти циклом по длине массива `nums`.
2. Записывать в `map` ключи `nums[i]` и значения `i`.
3. Если такой ключ уже встречался и расстояние между текущим и сохранённым индексами не превышает `k` – вернуть `true`.

## Код:

```java
import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (Math.abs(i - map.get(nums[i])) <= k)) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
```

## Сложность:

- **Время:** O(n)
- **Память:** O(n)
