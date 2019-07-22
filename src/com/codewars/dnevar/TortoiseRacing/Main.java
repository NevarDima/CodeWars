package com.codewars.dnevar.TortoiseRacing;

public class Main {
    public static void main(String[] args) {
        int[] res1 = race(720, 850, 70);
        for (int i = 0; i < res1.length; i++) {
            System.out.print(res1[i]+" ");
        }
        System.out.println();
        int[] res2 = race(80, 91, 37);
        for (int i = 0; i < res2.length; i++) {
            System.out.print(res2[i]+" ");
        }
        System.out.println();
        int[] res3 = race(80, 100, 40);
        for (int i = 0; i < res3.length; i++) {
            System.out.print(res3[i]+" ");
        }
        System.out.println();
    }

    static int[] race(int v1, int v2, int g) {
        int[] res = new int[3];
        if (v1>=v2 || g==0){
            return res;
        }
        double feetA = (double) g;
        double feetB = 0;
        double speedA = ((double)v1/60)/60;
        double speedB = ((double)v2/60)/60;
        while (feetA>=feetB) {
            feetA += speedA;
            feetB += speedB;
            res[2]++;
            if(res[2]==60){
                res[1]++;
                res[2]=0;
                if(res[1]==60){
                    res[0]++;
                    res[1]=0;
                }
            }
        }
        res[2]--;

        return res;
    }
}
