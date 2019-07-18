package com.codewars.dnevar.SumOfTheFirstNthTermOfSeries;


public class Main {
    public static void main(String[] args) {
        System.out.println(seriesSum(1));
        System.out.println(seriesSum(2));
        System.out.println(seriesSum(5));

    }

    public static String seriesSum(int n) {
        double sum = 0;
        for (double i = 0; i < n; i++) {
            sum = sum + (1 / ((3 * i) + 1));
        }
        return String.format("%.2f", sum);
    }
}
