package com.codewars.dnevar.SimplePigLatin;


public class Main {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig ")); // igPay atinlay siay oolcay
        System.out.println(pigIt("Hello world !"));     // elloHay orldway !
    }

    public static String pigIt(String str) {
        if(str.length()<1){
            return "";
        }
        String[] words = str.split("[^a-zA-Z]+");
        String[] nonWord = str.split("[a-zA-Z]+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String buffer = "";
            if(words[i].length()>1) {
                buffer = words[i].substring(1) + words[i].substring(0, 1) + "ay";
            } else {
                buffer = words[i] + "ay";
            }
            if(nonWord.length!=0) {
                result.append(nonWord[i]).append(buffer);
            }else{
                result.append(buffer);
            }
            if(i == words.length-1 && i == nonWord.length-2){
                result.append(nonWord[nonWord.length - 1]);
            }
        }

        return result.toString();
    }
}
