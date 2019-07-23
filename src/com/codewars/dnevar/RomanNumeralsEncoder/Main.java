package com.codewars.dnevar.RomanNumeralsEncoder;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(14));
        System.out.println(solution(3242));
//        System.out.println(solution(5));
    }

    public static String solution(int n) {
        StringBuilder num = new StringBuilder("");
        int m = n/1000;
        if(m>0){
            for (int i = 0; i < m; i++) {
                num.append("M");
            }
            n = n-m*1000;
        }
        int cd = n/100;
        if(cd>0) {
            switch (cd) {
                case 1:
                    num.append("C");
                    break;
                case 2:
                    num.append("CC");
                    break;
                case 3:
                    num.append("CCC");
                    break;
                case 4:
                    num.append("CD");
                    break;
                case 5:
                    num.append("D");
                    break;
                case 6:
                    num.append("DC");
                    break;
                case 7:
                    num.append("DCC");
                    break;
                case 8:
                    num.append("DCCC");
                    break;
                case 9:
                    num.append("CM");
                    break;
                default:
                    break;
            }
            n = n - cd * 100;
        }
        int lx = n/10;
        if(lx>0) {
            switch (lx) {
                case 1:
                    num.append("X");
                    break;
                case 2:
                    num.append("XX");
                    break;
                case 3:
                    num.append("XXX");
                    break;
                case 4:
                    num.append("XL");
                    break;
                case 5:
                    num.append("L");
                    break;
                case 6:
                    num.append("LX");
                    break;
                case 7:
                    num.append("LXX");
                    break;
                case 8:
                    num.append("LXXX");
                    break;
                case 9:
                    num.append("XC");
                    break;
                default:
                    break;
            }
            n = n - lx * 10;
        }
        if(n>0) {
            switch (n) {
                case 1:
                    num.append("I");
                    break;
                case 2:
                    num.append("II");
                    break;
                case 3:
                    num.append("III");
                    break;
                case 4:
                    num.append("IV");
                    break;
                case 5:
                    num.append("V");
                    break;
                case 6:
                    num.append("VI");
                    break;
                case 7:
                    num.append("VII");
                    break;
                case 8:
                    num.append("VIII");
                    break;
                case 9:
                    num.append("IX");
                    break;
                default:
                    break;
            }
        }
        return num.toString();
    }
}
