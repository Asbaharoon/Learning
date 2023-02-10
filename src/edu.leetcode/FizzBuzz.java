package edu.leetcode;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz

public class FizzBuzz {
    /*public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                answer.add("Fizz");
            }
            else if (i % 5 == 0){
                answer.add("Buzz");
            }
            else {
                answer.add(String.valueOf(i));
            }
        }
        return answer;
    }*/

    /*public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            answer.add(
                    i % 15 == 0 ? "FizzBuzz":
                            i % 5 == 0 ? "Buzz":
                                    i % 3 == 0 ? "Fizz":
                                            String.valueOf(i)
            );
        }
        return answer;
    }*/
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) answer.add("FizzBuzz");
            else if (i % 3 == 0) answer.add("Fizz");
            else if (i % 5 == 0) answer.add("Buzz");
            else answer.add(String.valueOf(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
