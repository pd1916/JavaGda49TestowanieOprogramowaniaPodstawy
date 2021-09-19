package pl.sdacademy.unit.test.basic.exercises.tdd.task2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilWithParameterizedTestMethodSource {

    @ParameterizedTest
    @MethodSource("provideData")
    void shouldReturnCorrectResult(String input, boolean expectedResult) {
        // when
        boolean result = StringUtilWithParameterized.isBlank(input);
        // then
        assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("a", false),
                Arguments.of(" a", false),
                Arguments.of("a ", false),
                Arguments.of(" a ", false),
                Arguments.of(" ", true),
                Arguments.of("", true),
                Arguments.of("  ", true),
                Arguments.of("\n", true),
                Arguments.of(null, true)
        );
    }
}
