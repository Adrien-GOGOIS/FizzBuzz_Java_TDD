package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    FizzBuzz game = new FizzBuzz();

    @Test
    void should_return_1() {
        Assertions.assertThat(game.fizzBuzzConvertor(1)).isEqualTo("1");
    }

    @Test
    void should_return_fizz_number_multiple_of_3() {
        Assertions.assertThat(game.fizzBuzzConvertor(6)).isEqualTo("Fizz");
    }

    @Test
    void should_return_buzz_number_multiple_of_5() {
        Assertions.assertThat(game.fizzBuzzConvertor(5)).isEqualTo("Buzz");
    }

    @Test
    void should_return_buzz_number_multiple_of_15() {
        Assertions.assertThat(game.fizzBuzzConvertor(15)).isEqualTo("FizzBuzz");
        Assertions.assertThat(game.fizzBuzzConvertor(30)).isEqualTo("FizzBuzz");
        Assertions.assertThat(game.fizzBuzzConvertor(75)).isEqualTo("FizzBuzz");
    }

}
