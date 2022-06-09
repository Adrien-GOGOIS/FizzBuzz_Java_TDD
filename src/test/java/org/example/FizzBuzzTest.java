package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    FizzBuzz game = new FizzBuzz();

    @Test
    void should_return_0() {
        Assertions.assertThat(game.fizzBuzzLoop()).isEqualTo(0);
    }

}
