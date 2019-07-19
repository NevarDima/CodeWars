package com.codewars.dnevar.CountTheSmileyFaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add(":)"); arr.add(":)"); arr.add("x-]"); arr.add(":ox"); arr.add(";-("); arr.add(";-)"); arr.add(";~("); arr.add(":~D");
        System.out.println(countSmileys(arr));
    }

    private static int countSmileys(List<String> arr) {
        int count = 0;
        for (String face : arr) {
            if(face.matches("[;:]{1}([-~]{1})?[)D]{1}")){
                count++;
            }
        }
        return count;
    }
}
