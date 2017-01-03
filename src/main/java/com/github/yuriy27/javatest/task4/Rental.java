package com.github.yuriy27.javatest.task4;

/**
 * Created by Юра on 03.01.2017.
 *
 * Explanation of moving amountFor() method in this class:
 * I think that all logic which connected with Rental shouldn't be
 * in Customer class. It should be in Rental. Also when we move this
 * method to Rental we can make getBasePrice() private thus we
 * encapsulate this method.
 *
 * Proposes for improving code quality:
 * 1.We can storage rental kinds in enum instead of int field.
 * 2.getBasePrice() as private method can be replaced by constant BASE_PRICE.
 * 3.In amountFor() method we can replace getDays() method with days variable
 *  and getKind() with kind.
 *
 */
public class Rental {

    private int days;
    private int kind;

    public Rental(int kind, int days) {
        this.kind = kind;
        this.days = days;
    }

    private double amountFor() {
        double result = getDays() * getBasePrice();
        if (getKind() == 1) {
            result = result * 1.5;
        }
        if (getKind() == 2) {
            result = result * 2;
        }
        if (getKind() == 3) {
            result = result * 2.5;
        }
        if (getDays() > 7) {
            result = result * 3;
        }

        return result;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    private double getBasePrice() {
        return 20;
    }

}
