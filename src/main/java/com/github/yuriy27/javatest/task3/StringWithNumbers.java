package com.github.yuriy27.javatest.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Юра on 02.01.2017.
 */
public class StringWithNumbers {

    public static void drawNumbers(String str) {
        List<Integer> numbers = new ArrayList();
        Pattern pattern = Pattern.compile("[0-9]+[+-/*][0-9]+|[0-9]+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            numbers.add(getNumber(matcher.group()));
        }
        System.out.println("Numbers:");
        numbers.forEach(numb -> System.out.println(numb));
        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));
    }

    private static Integer getNumber(String str) {
        String[] operations = {"+", "-", "*", "/"};
        for (int i = 0; i < operations.length; i++) {
            String current = operations[i];
            if (str.contains(current)) {
                int arg1 = Integer.parseInt(str.substring(0, str.indexOf(current)));
                int arg2 = Integer.parseInt(str.substring(str.indexOf(current) + 1));
                switch (i) {
                    case 0: return arg1 + arg2;
                    case 1: return arg1 - arg2;
                    case 2: return arg1 * arg2;
                    case 3: return arg1 / arg2;
                }
            }
        }

        return Integer.parseInt(str);
    }

}
