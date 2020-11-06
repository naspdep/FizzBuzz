package com.test.fizzbuzz;

import com.test.fizzbuzz.exceptions.InvalidNumberException;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzCalc {
    public static List<String> generateFizzBuzz(int number) throws InvalidNumberException {
        if (number <= 0)
            throw new InvalidNumberException("Number " + number + " is lower than 1. (Possibly no number given)");

        List<String> fizzBuzzString = new ArrayList<>();
        String str = "";

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str = "fizzbuzz";
            } else if (i % 3 == 0) {
                str = "fizz";
            } else if (i % 5 == 0) {
                str = "buzz";
            } else {
                str = Integer.toString(i);
            }
            fizzBuzzString.add(str);
        }
        return fizzBuzzString;
    }
}
