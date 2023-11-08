package ru.netology.javaqa;

public class SalesService {
    public int getOllSales(long[] sales) {     //ищем сумму всех продаж
        int ollSales = 0;
        for (int i = 0; i < sales.length; i++) {
            ollSales += sales[i];
        }
        return ollSales;
    }

    public int getAverageSales(long[] sales) {    // ищем среднюю сумму продаж в месяц
        int OllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            OllSales += sales[i];
        }
        int AverageSales = OllSales / 12;
        return AverageSales;
    }

    public int maxSales(long[] sales) {  // ищем номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //ищем номер месяца, в котором был минимум продаж
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int summMonthSalesLessAverage(long[] sales) { // считаем количество месяцев, в которых продажи были ниже среднего
        int ollMinMonth = 0;
        int lessAverageSales = getAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < lessAverageSales) {
                ollMinMonth++;
            }
        }
        return ollMinMonth;
    }

    public int summMonthSalesMoreAverage(long[] sales) { // считаем количество месяцев, в которых продажи были выше среднего
        int ollMaxMonth = 0;
        int moreAverageSales = getAverageSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > moreAverageSales) {
                ollMaxMonth++;
            }
        }
        return ollMaxMonth;
    }
}
