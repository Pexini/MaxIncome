package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        StatisticsService service = new StatisticsService();
        long maxResult = service.findMax(incomes);
        System.out.println("Maximum = " + maxResult);
    }
}