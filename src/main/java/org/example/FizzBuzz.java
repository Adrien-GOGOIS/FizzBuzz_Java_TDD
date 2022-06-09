package org.example;

public class FizzBuzz {

    public String fizzBuzzConvertor(int numberToConvert) {

            if (numberToConvert % 3 == 0) {
                return "Fizz";
            }

        return Integer.toString(numberToConvert);
    }
}
