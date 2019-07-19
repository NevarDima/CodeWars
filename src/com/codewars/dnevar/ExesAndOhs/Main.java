package com.codewars.dnevar.ExesAndOhs;

public class Main {
    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("XxxxooO"));

    }

    public static boolean getXO (String str) {
        return str.toLowerCase().replaceAll("[^xo]+","").length()
                == str.toLowerCase().replaceAll("[^x]+","").length()*2;
    }
}
