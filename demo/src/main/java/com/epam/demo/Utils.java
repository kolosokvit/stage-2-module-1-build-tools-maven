package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String s : args) {
            if (s.startsWith("-")) {
                return false;
            }
        }
        return true;
    }
}