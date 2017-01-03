package com.github.yuriy27.javatest;

import com.github.yuriy27.javatest.task3.StringWithNumbers;
import org.junit.Test;

/**
 * Created by Юра on 02.01.2017.
 */
public class StringWithNumbersTest {

    @Test
    public void test1() {
        StringWithNumbers.drawNumbers("gt1+003og12ijojio21i3ji0000oj");
        System.out.println();
    }

    @Test
    public void test2() {
        StringWithNumbers.drawNumbers("0000000");
        System.out.println();
    }

    @Test
    public void test3() {
        StringWithNumbers.drawNumbers("ropgop1+3grogk2*3gtrgt004/00002gr1-1");
        System.out.println();
    }
}
