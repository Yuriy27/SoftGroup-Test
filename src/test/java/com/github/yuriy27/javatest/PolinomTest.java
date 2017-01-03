package com.github.yuriy27.javatest;

import com.github.yuriy27.javatest.task2.Polinom;
import org.junit.Test;

/**
 * Created by Юра on 02.01.2017.
 */
public class PolinomTest {

    @Test
    public void test1() {
        Polinom.calculate(3, 5, 4);
    }

    @Test
    public void test2() {
        Polinom.calculate(1, 1, 6);
    }

    @Test
    public void test3() {
        Polinom.calculate(0, 0, 0);
    }

    @Test
    public void test4() {
        Polinom.calculate(0, 0, 1);
    }

    @Test
    public void test5() {
        Polinom.calculate(1, 1, 1);
    }

    @Test
    public void test6() {
        Polinom.calculate(1, 1, 2);
    }

    @Test
    public void testWithNegative() {
        Polinom.calculate(1, 3, -2);
    }
}
