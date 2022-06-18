package ru.netology.sqr;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"100, 200, 5",
                        "400, 1000, 12",
                        "200, 300, 3"})
    public void shouldCalc(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.squaresCalculate(min, max);
         assertEquals(expected, actual);
    }

}
