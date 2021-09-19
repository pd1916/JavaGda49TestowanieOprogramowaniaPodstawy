package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    // ""
    // " "
    // null
    // "test"
    // "\n"
    // " a"
    // "a "
    // " a "
    // "  "
    // "a b"

    @Test
    void shouldReturnTrueIfStringIsEmpty() {
        //given
        String input = "";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //junit5
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringIsNewLine() {
        //given
        String input = "\n";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result); //junit5
        assertThat(result).isTrue(); //assertJ
    }

    @Test
    void shouldReturnTrueIfStringContainsOnlySpaces() {
        //given
        String input = " ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest1() {
        //given
        String input = "a";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest2() {
        //given
        String input = " a";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest3() {
        //given
        String input = "a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldReturnFalseIfStringIsNotEmptyTest4() {
        //given
        String input = " a ";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }
}