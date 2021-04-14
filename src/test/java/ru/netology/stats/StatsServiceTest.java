package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void amountAll() {
        int expected = 180;
        int actual = StatsService.amountAll(sales);
        assertEquals(expected, actual);
    }

    @Test
    void amountAverage() {
        int expected = 15;
        int actual = StatsService.amountAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthMaxSales() {
        int expected = 8;
        int actual = StatsService.monthMaxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthMinSales() {
        int expected = 9;
        int actual = StatsService.monthMinSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void salesDownAverage() {
        int expected = 5;
        int actual = StatsService.salesDownAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void salesUpAverage() {
        int expected = 5;
        int actual = StatsService.salesUpAverage(sales);
        assertEquals(expected, actual);
    }
}