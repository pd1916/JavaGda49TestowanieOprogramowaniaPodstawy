package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFormatterTest {

    @Test
    void shouldReturnFormatDateToYearDayMonth() {
        //given
        String expectedDate = "1900-02-01";
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate inputDate = LocalDate.of(1900, 01, 02);
        //when
        String result = dateFormatter.formatDate(inputDate);
        //then
        assertEquals(expectedDate, result);
        assertThat(result).isEqualTo(expectedDate);
    }
}