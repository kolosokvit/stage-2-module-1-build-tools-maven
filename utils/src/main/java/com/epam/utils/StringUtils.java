package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return str.equals("0") || !str.startsWith("-");
    }
}
