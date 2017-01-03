package com.github.yuriy27.javatest;

import com.github.yuriy27.javatest.task1.PascalTriangle;
import org.junit.Test;

/**
 * Created by Юра on 29.12.2016.
 */
public class PascalTriangleTest {

    public void printTrianglesRow(int n) {
        int[] row = PascalTriangle.getTrianglesRow(n);
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void testPascalTriangleWithOne() {
        printTrianglesRow(1);
    }

    @Test
    public void testPascalTriangleWithTwo() {
        printTrianglesRow(2);
    }

    @Test
    public void testPascalTriangleWithThree() {
        printTrianglesRow(3);
    }

    @Test
    public void testPascalTriangleWithFive() {
        printTrianglesRow(5);
    }

    @Test
    public void testPascalTriangleWithTen() {
        printTrianglesRow(10);
    }

    @Test
    public void testPascalTriangleWithZero() {
        printTrianglesRow(0);
    }

    @Test(expected = RuntimeException.class)
    public void testPascalTriangleWithNegative() {
        printTrianglesRow(-5);
    }
}
