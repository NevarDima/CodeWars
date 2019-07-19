package com.codewars.dnevar.RegexValidatePINCode;

public class Main {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin("123456"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4,6}") && !pin.matches("[0-9]{5}");
    }
}
