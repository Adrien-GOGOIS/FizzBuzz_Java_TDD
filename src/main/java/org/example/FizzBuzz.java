package org.example;

public class FizzBuzz {

    public String fizzBuzzConvertor(int numberToConvert) {


            if (numberToConvert % 15 == 0) {
                return "FizzBuzz";
            }

            if (numberToConvert % 3 == 0) {
                return "Fizz";
            }

            if (numberToConvert % 5 == 0) {
                return "Buzz";
            }

        return Integer.toString(numberToConvert);
    }
}
