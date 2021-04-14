package ru.netology.stats;

public class StatsService {

    public static int amountAll(int[] sales)    {
        int amount = 0;
        for (int sale : sales) {
            amount += sale;
        }
        return amount;
    }

    public static int amountAverage(int[] sales)    {
        int amount = amountAll(sales);
        return amount / sales.length;
    }

    public static int monthMaxSales(int[] sales)    {
        int max = maxSales(sales);
        int numMonth = 0;  //отсчет месяца
        int monthTotal = 0; //итоговый номер месяца с максимальной продажей
        for (int sale : sales) {
            numMonth ++;
            if (sale == max) {
                monthTotal = numMonth;
            }
        }
        return monthTotal;
    }

    public static int maxSales(int[] sales)    {   //считаем максимальную продажу
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public static int monthMinSales(int[] sales)    {
        int min = minSales(sales);
        int numMonth = 0;  //отсчет месяца
        int monthTotal = 0; //итоговый номер месяца с минимальной продажей
        for (int sale : sales) {
            numMonth ++;
            if (sale == min) {
                monthTotal = numMonth;
            }
        }
        return monthTotal;
    }

    public static int minSales(int[] sales)    {   //считаем минимальную продажу
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public static int salesDownAverage(int[] sales)    {
        int average = amountAverage(sales);
        int months = 0;
        for (int sale : sales) {
             if (sale < average) {
                months++;
            }
        }
        return months;
    }

    public static int salesUpAverage(int[] sales)    {
        int average = amountAverage(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale > average) {
                months++;
            }
        }
        return months;
    }
}