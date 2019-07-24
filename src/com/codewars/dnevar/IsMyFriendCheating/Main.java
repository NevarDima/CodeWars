package com.codewars.dnevar.IsMyFriendCheating;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        removNb(26);
    }

    public static List<long[]> removNb(long n) {
        List<long[]> res = new ArrayList<>();
        long sum = (n*(n+1))/2;

        for (long b = n; b > 0; b--) {
            long a = (sum-b)/(b+1);
            if(a<n && a*b == sum-a-b){
                res.add(new long[]{a,b});
            }
        }
        return res;
    }
}
