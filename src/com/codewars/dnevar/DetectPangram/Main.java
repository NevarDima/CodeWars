package com.codewars.dnevar.DetectPangram;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
    }

    static boolean check(String sentence){
        sentence = sentence.toLowerCase().replaceAll("[^a-z]+","");
        char[] arr = sentence.toCharArray();
        Set<Character> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return hashSet.size()==26;
    }
}
