# 217. Contains Duplicate

- **Уровень:** Easy
- **Паттерн:** Множество
- **Ссылка:** https://leetcode.com/problems/contains-duplicate/

## Краткое условие:

Дан массив чисел `nums`. Вернуть `true`, если хотя бы раз встречается дубликат и `false`, если не встречается

## Идея решения:

1. Пройтись по данному массиву `nums`.
2. Выполнить проверку:
   - если число нельзя добавить в set `!set.add(num)`, то вернуть `true`;
   - иначе продолжить проверку.
3. Если цикл завершился и дубликатов не было найдено – вернуть `false`.

## Код:

```java
import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
```

## Сложность:

- **Время:** O(n)
- **Память:** O(n)
