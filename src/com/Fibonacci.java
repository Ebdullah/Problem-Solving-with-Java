package com;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Integer> map = new HashMap<>();
//    Iterator Approach
    public  void fibonacci_series(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;

        System.out.printf(first + " " + second + " ");
        for(int i = 2; i < n; i++){
            sum = first + second;
            first = second;
            second = sum;
            System.out.printf(sum + " ");
        }
    }

//    Recursive Approach
    public  int fibonacci_series_recursively(int n){
        if(n <= 1){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = fibonacci_series_recursively(n-1) + fibonacci_series_recursively(n-2);
        map.put(n,result);
        return result;
    }
}
