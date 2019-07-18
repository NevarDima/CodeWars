package com.codewars.dnevar.VasyaClerk;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(Tickets(new int[] {25, 25, 50}));
        System.out.println(Tickets(new int[] {25, 100}));
        System.out.println(Tickets(new int[] {25, 25, 50, 50, 100}));
    }

    public static String Tickets(int[] peopleInLine){
        int[] arr = new int[3];
        String res = "YES";

        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i]==25){
                arr[0]++;
            } else if (peopleInLine[i]==50){
                if(arr[0]>0){
                    arr[1]++;
                    arr[0]--;
                } else{
                    res = String.format("NO. Vasya will not have enough money to give change to %d dollars",peopleInLine[i]);
                    break;
                }
            } else if (peopleInLine[i]==100){
                if(arr[0]>0 && arr[1]>0){
                    arr[1]--;
                    arr[0]--;
                } else if(arr[0]>2 && arr[1]==0){
                    arr[0] = arr[0]-3;
                    arr[2]++;
                } else if (arr[0]<3 && arr[1]==0){
                    res = String.format("NO. Vasya will not have enough money to give change to %d dollars",peopleInLine[i]);
                    break;
                } else if (arr[0]==0 && arr[1]>1){
                    res = String.format("NO. Vasya will not have the right bills to give 75 dollars of change (you can't make two bills of 25 from one of 50)");
                    break;
                }
            }
        }
        return res;
    }
}
