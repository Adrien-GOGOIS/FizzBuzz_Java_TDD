package org.example;

public class FizzBuzz {
    private int numberToConvert;
    public String fizzBuzzConvertor(int numberToConvert) {

        this.numberToConvert = numberToConvert;

        if (isMultipleOf15()) { return "FizzBuzz"; }

        if (isMultipleOf5()) { return "Buzz"; }

        if (isMultipleOf3()) { return "Fizz"; }

        return Integer.toString(numberToConvert);
    }

    private boolean isMultipleOf15() {
        return numberToConvert % 15 == 0;
    }

    private boolean isMultipleOf5() {
        return numberToConvert % 5 == 0;
    }

    private boolean isMultipleOf3() {
        return numberToConvert % 3 == 0;
    }
}
