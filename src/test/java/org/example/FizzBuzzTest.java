package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    FizzBuzz game = new FizzBuzz();

    @Test
    void should_return_100() {
        Assertions.assertThat(game.fizzBuzzLoop(100)).isEqualTo("100");
    }
    @Test
    void should_return_10() {
        Assertions.assertThat(game.fizzBuzzLoop(10)).isEqualTo("10");
    }

    /*@Test
    void should_return_fizz_number_multiple_of_3() {
        Assertions.assertThat(game.fizzBuzzLoop(3)).isEqualTo("Fizz");
    }*/

}
