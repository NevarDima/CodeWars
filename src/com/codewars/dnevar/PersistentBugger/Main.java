package com.codewars.dnevar.PersistentBugger;

public class Main {
    public static void main(String[] args) {
        System.out.println(persistence(308927));
        System.out.println(persistence(999));
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {
        if(n<10){
            return 0;
        }
        int count = 1;
        long buffer;
        long res = 1;
        while(n%10 > 0 || n/10>0){
            buffer = n%10;
            n = n/10;
            res *= buffer;
        }
        count += persistence(res);

        return count;
    }
}
