package com.codewars.dnevar.BeginnerSeriesSumOfNumbers;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSum(1, 0));
        System.out.println(getSum(0, 1));
        System.out.println(getSum(1, 1));
        System.out.println(getSum(-1, 0));
        System.out.println(getSum(-1, 2));

    }

    static public int getSum (int a,int b){
        int sum = 0;
        if(a>b){
            for (int i = b; i <= a ; i++) {
                sum+=i;
            }
        } else {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        }
        return sum;
    }
}
