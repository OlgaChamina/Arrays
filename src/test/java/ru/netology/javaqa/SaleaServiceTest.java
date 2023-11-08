package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;

public class SaleaServiceTest {

    @Test //ищем сумму всех продаж
    public void findOllSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.getOllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test            //ищем среднюю сумму продаж в месяц
    public void findAverageSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.getAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test          // ищем номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public void findMaxSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test         // ищем номер месяца, в котором был минимум продаж
    public void findMinSales() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test        // считаем количество месяцев, в которых продажи были ниже среднего
    public void findSammMonthSalesLessAverage() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.summMonthSalesLessAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test       // считаем количество месяцев, в которых продажи были выше среднего
    public void findSummMonthSalesMoreAverage() {
        SalesService service = new SalesService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.summMonthSalesLessAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

}
