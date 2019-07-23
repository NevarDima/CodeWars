package com.codewars.dnevar.BouncingBalls;

public class Main {
    public static void main(String[] args) {
        System.out.println("result " + bouncingBall(30,0.66,1.5));
        System.out.println("result " + bouncingBall(3,1,1.5));
    }

    public static int bouncingBall(double h, double bounce, double window) {
        if(h<=0 || window>=h || bounce<=0 || bounce>=1){
            return -1;
        }
        int res = 1;
        while(h>window){
            h = h * bounce;
            if(h>window){
                res += 2;
            }
        }
        return res;
    }
}
