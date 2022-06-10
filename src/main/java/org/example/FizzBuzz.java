package org.example;

public class FizzBuzz {

    public String fizzBuzzConvertor(int numberToConvert) {

        if (isMultipleOfFifteen(numberToConvert)) { return "FizzBuzz"; }

        if (isMultipleOfFive(numberToConvert)) { return "Buzz"; }

        if (isMultipleOfThree(numberToConvert)) { return "Fizz"; }

        return IntegerToStringConverter(numberToConvert);
    }

    private boolean isMultipleOfFifteen(int numberToConvert) {
        return numberToConvert % 15 == 0;
    }

    private boolean isMultipleOfFive(int numberToConvert) {
        return numberToConvert % 5 == 0;
    }

    private boolean isMultipleOfThree(int numberToConvert) {
        return numberToConvert % 3 == 0;
    }

    private String IntegerToStringConverter(int numberToConvert) { return Integer.toString(numberToConvert); }
}
