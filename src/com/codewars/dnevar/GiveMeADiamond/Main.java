package com.codewars.dnevar.GiveMeADiamond;

public class Main {
    public static void main(String[] args) {
        System.out.println(print(3));
        System.out.println(print(5));
        System.out.println(print(7));
        System.out.println(print(9));
        System.out.println(print(11));
        System.out.println(print(-1));
        System.out.println(print(2));
    }

    public static String print(int n) {
        if(n<1 || n%2==0){
            return null;
        }
        StringBuilder res = new StringBuilder();
        int countSpace = n/2;
        int countAsterisk = 1;
        for (int i = 1; i <= n; i++) {
            if(i<=n/2){
                for (int h = 0; h < countSpace; h++) {
                    res.append(" ");
                }
                countSpace--;
                for (int g = 0; g < countAsterisk; g++) {
                    res.append("*");
                }
                countAsterisk+=2;
            } else if(i>n/2){
                for (int h = 0; h < countSpace; h++) {
                    res.append(" ");
                }
                countSpace++;
                for (int g = 0; g < countAsterisk; g++) {
                    res.append("*");
                }
                countAsterisk-=2;
            }
            res.append("\n");
        }
        return res.toString();
    }
}
