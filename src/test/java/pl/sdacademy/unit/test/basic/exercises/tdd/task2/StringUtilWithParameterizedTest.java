package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilWithParameterizedTest {

    // "a" , " a", "a ", " a ", "a b"

    @ParameterizedTest
    @ValueSource(strings = {"a", " a", "a ", " a ", "a b"})
    void shouldReturnFalseIfInputIsNotEmpty(String input) {
        // when
        boolean result = StringUtilWithParameterized.isBlank(input);
        // then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "  ", "\n"})
    void shouldReturnTrueIfInputIsEmpty(String input) {
        // when
        boolean result = StringUtilWithParameterized.isBlank(input);
        // then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnTrueIfInputIsNull() {
        // when
        boolean result = StringUtilWithParameterized.isBlank(null);
        // then
        assertTrue(result);
        assertThat(result).isTrue();
    }
}