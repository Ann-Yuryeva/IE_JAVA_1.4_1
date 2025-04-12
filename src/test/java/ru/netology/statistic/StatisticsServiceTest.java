package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 100};;
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWhenMaxInMiddle() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 7, 20, 3, 1}; // 20 — макс, попадёт в if
        long expected = 20;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
}
