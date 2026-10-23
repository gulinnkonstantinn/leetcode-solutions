// 412. Fizz Buzz
// Сложность: Easy
// Паттерн: Условия
// Ссылка: https://leetcode.com/problems/fizz-buzz/


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