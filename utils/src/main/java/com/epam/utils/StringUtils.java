package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return !str.startsWith("-") && !str.equals("0");
    }

    public static void main(String[] args) {
        System.out.println(isPositiveNumber("33"));
    }
}
