package pl.sdacademy.unit.test.basic.exercises.unit.task5;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithExceptionTest {

    // #2 Option
    private static CalculatorWithException calculator;

    @BeforeAll
    static void init() {
        calculator = new CalculatorWithException();
    }

    @Test
    void shouldCorrectDivideTwoValues() {
        // given
        int expectedResult = 2;
        // #1 option
        //CalculatorWithException calculator = new CalculatorWithException();
        // when
        int result = calculator.divide(6, 3);
        //then
        assertEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldThrowExceptionIfSecondNumberIsEqualToZero() {
        //junit5
        assertThrows(
                ArithmeticException.class,
                () -> calculator.divide(2 , 0),
                "Cannot divide by zero!");

        //assertj
        assertThatThrownBy(() -> calculator.divide(2 ,0))
                .hasMessage("Cannot divide by zero!")
                .isInstanceOf(ArithmeticException.class);
    }
}