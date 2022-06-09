package org.example;

public class FizzBuzz {

    private int actualNumber;
    public String fizzBuzzLoop(int n) {
        for (int i = 1; i <= n; i++) {
            actualNumber++;
        }

        return Integer.toString(actualNumber);
    }
}
