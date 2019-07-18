package com.codewars.dnevar.WhoLikesIt;

public class Main {
    public static void main(String[] args) {
        String [] names1 = {};
        String [] names2 = {"Peter"};
        String [] names3 = {"Jacob", "Alex"};
        String [] names4 = {"Max", "John", "Mark"};
        String [] names5 = {"Alex", "Jacob", "Mark", "Max"};
        System.out.println(whoLikesIt(names1));
        System.out.println(whoLikesIt(names2));
        System.out.println(whoLikesIt(names3));
        System.out.println(whoLikesIt(names4));
        System.out.println(whoLikesIt(names5));


    }

    public static String whoLikesIt(String... names) {
        int num = names.length;
        String res;
        switch(num){
            case 0:
                res = "no one likes this";
                break;
            case 1:
                res = names[0] + " likes this";
                break;
            case 2:
                res = names[0] + " and " + names[1] + " like this";
                break;
            case 3:
                res = names[0] +", " + names[1] + " and " + names[2] + " like this";
                break;
            default:
                res = names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
                break;

        }

        return res;
    }
}
