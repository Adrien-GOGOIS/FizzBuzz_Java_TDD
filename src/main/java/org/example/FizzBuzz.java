package org.example;

public class FizzBuzz {

    private int numberToConvert;

    public String fizzBuzzConvertor(int numberToConvert) {

        this.numberToConvert = numberToConvert;

        if (isMultipleOfFifteen()) { return "FizzBuzz"; }

        if (isMultipleOfFive()) { return "Buzz"; }

        if (isMultipleOfThree()) { return "Fizz"; }

        return IntegerToStringConverter();
    }

    private boolean isMultipleOfFifteen() {
        return numberToConvert % 15 == 0;
    }

    private boolean isMultipleOfFive() {
        return numberToConvert % 5 == 0;
    }

    private boolean isMultipleOfThree() {
        return numberToConvert % 3 == 0;
    }

    private String IntegerToStringConverter() { return Integer.toString(numberToConvert); }
}
