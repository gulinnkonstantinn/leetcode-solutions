# 412. Fizz Buzz

- **Уровень:** easy
- **Паттерн:** условия
- **Ссылка:** https://leetcode.com/problems/fizz-buzz/

## Краткое условие:
Дано число n. Нужно вернуть массив строк answer длины n, в котором:
`answer[i] == "FizzBuzz"`, если `i % 3 == 0` и `i % 5 == 0`
`answer[i] == "Fizz"`, если `i % 3 == 0`
`answer[i] == "Buzz"`, если `i % 5 == 0`
`answer[i] == (i + 1)` в остальных случаях

## Идея решения:
1. Заполнять массив по порядку от 1 до n
2. На каждой итерации проверять условия деления

## Код:
```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            String value = String.valueOf(i);
            if (i % 15 == 0) {
                answer.add("FizzBuzz");
            } else if (i % 3 == 0) {
                answer.add("Fizz");
            } else if (i % 5 == 0) {
                answer.add("Buzz");
            }
            else {
                answer.add(value);
            }
        }
        return answer;
    }
}
```

## Сложность:
- **Время:** O(n)
- **Память:** O(n)
