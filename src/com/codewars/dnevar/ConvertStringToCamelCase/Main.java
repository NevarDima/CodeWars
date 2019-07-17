package com.codewars.dnevar.ConvertStringToCamelCase;


public class Main {
    public static void main(String[] args) {
        String s = "down-river-down";
        String res = "";
        String[] arr = s.split("[^a-zA-Z]+");
        for (int i = 0; i < arr.length; i++){
            if(i==0){
                res += arr[i];
            }else {
                String word = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                res += word;
            }
        }
        System.out.println(res);
    }
}
