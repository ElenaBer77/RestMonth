package ru.netology.services.restMonth.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.restMonth.services.RestMonthService;

public class RestMonthTest {
    @Test
    public void calculationOfVacationMonthsLow() {
        RestMonthService service = new RestMonthService();
        int expected = 3;
        int income = 10_000; // доход
        int expense = 3_000; // расход
        int threshold = 20_000; // порог
        int actual = service.calculator(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculationOfVacationMonthsHigh() {
        RestMonthService service = new RestMonthService();
        int expected = 2;
        int income = 100_000; // доход
        int expense = 60_000; // расход
        int threshold = 150_000; // порог
        int actual = service.calculator(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
