package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FreelancingTest {

    @Test
    @CsvFileSource(files = "src/test/resources/mounth.csv")

    public void testCalculate1() {
        Freelancing service = new Freelancing();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    @CsvFileSource(files = "src/test/resources/mounth.csv")

    public void testCalculate2() {
        Freelancing service = new Freelancing();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
}