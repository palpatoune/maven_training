package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SampleTest {
    private final fr.lernejo.Sample sample = new fr.lernejo.Sample();

    @Test
    void add_2_to_6_should_produce_8() {
        int x = 2;
        int y = 6;
        int result = sample.op(fr.lernejo.Sample.Operation.ADD, x, y);

        Assertions.assertThat(result).as("addition of 2 and 6")
            .isEqualTo(8);
    }

    @Test
    void multiply_2_to_6_should_produce_12() {
        int x = 2;
        int y = 6;
        int result = sample.op(Sample.Operation.MULT, x, y);

        Assertions.assertThat(result).as("mutiplication of 2 and 6")
            .isEqualTo(12);
    }
}
