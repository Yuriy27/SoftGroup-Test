package com.github.yuriy27.javatest.task1;

/**
 * Created by Юра on 29.12.2016.
 */
public class PascalTriangle {

    public static int[] getTrianglesRow(int n) {
        if (n < 0) {
            throw new RuntimeException("There is no row with negative index");
        }
        int[] row = new int[n + 1];
        int size = row.length;
        int mid = size / 2 + size % 2;
        for (int i = 0; i < mid; i++) {
            switch (i) {
                case 0: row[i] = row[size - i - 1] = 1; break;
                case 1: row[i] = row[size - i - 1] = n; break;
                case 2: row[i] = row[size - i - 1] = n * (n - 1) / 2; break;
                default: {
                    row[i] = row[size - i - 1] = binom(n, i);
                }
            }
        }

        return row;
    }

    private static int binom(int n, int m) {
        return fact(n) / (fact(m) * fact(n - m));
    }

    private static int fact(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

}
