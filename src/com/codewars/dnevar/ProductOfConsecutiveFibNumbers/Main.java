package com.codewars.dnevar.ProductOfConsecutiveFibNumbers;

public class Main {
    public static void main(String[] args) {
        long[] res = productFib(5895);
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ",res[i]);
        }
    }

    public static long[] productFib(long prod) {
        long[] res = new long[3];
        long[] fibNum = new long[1000];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for (int i = 2; i < fibNum.length; i++) {
            fibNum[i] = fibNum[i-2]+fibNum[i-1];
            if (fibNum[i-2]*fibNum[i-1]==prod) {
                res[0] = fibNum[i-2];
                res[1] = fibNum[i-1];
                res[2] = 1;
                break;
            } else if (fibNum[i-2]*fibNum[i-1]>prod) {
                res[0] = fibNum[i-2];
                res[1] = fibNum[i-1];
                res[2] = 0;
                break;
            }
        }

        return res;
    }
}
