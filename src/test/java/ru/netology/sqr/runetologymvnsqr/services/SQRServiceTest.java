package ru.netology.sqr.runetologymvnsqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/SQR.csv")
    public void test(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
