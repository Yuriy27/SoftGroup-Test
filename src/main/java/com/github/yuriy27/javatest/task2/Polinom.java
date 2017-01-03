package com.github.yuriy27.javatest.task2;

import com.github.yuriy27.javatest.task1.PascalTriangle;

/**
 * Created by Юра on 29.12.2016.
 */
public class Polinom {

    public static void calculate(int a, int b, int n) {
        if (n == 0) {
            System.out.println("(a+b)^0=1");
            return;
        }
        if (n == 1) {
            System.out.println("a+b=" + (a + b));
            return;
        }
        StringBuilder result = new StringBuilder();
        if (n < 0) {
            result.append("1/(");
        }
        int maxInd = Math.abs(n);
        int[] binoms = PascalTriangle.getTrianglesRow(maxInd);
        int indA = maxInd;
        int indB = 0;
        while (indB <= maxInd) {
            if (indA > 0) {
                if (indA == 1) {
                    result.append("a");
                } else {
                    result.append("a^" + indA);
                }
            }
            if (indB > 0) {
                if (indB == 1) {
                    result.append("*b");
                } else {
                    if (indB == maxInd) {
                        result.append("b^" + indB);
                    } else {
                        result.append("*b^" + indB);
                    }
                }
            }
            indA--;
            indB++;
            if (indB <= maxInd) {
                result.append("+" + (indB == maxInd ? "" : binoms[indB] + "*"));
            }
        }
        if (n < 0) {
            result.append(")");
        }
        result.append("=" + Math.pow(a + b, n));
        System.out.println(result);
    }

}
