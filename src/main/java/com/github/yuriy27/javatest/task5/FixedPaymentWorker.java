package com.github.yuriy27.javatest.task5;

/**
 * Created by Юра on 03.01.2017.
 */
public class FixedPaymentWorker extends Worker {

    private double monthlyPayment;

    public FixedPaymentWorker(long id, String name, double monthlyPayment) {
        super(id, name);
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public double averageSalary() {
        return monthlyPayment;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FixedPaymentWorker that = (FixedPaymentWorker) o;

        return Double.compare(that.monthlyPayment, monthlyPayment) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(monthlyPayment);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "FixedPaymentWorker{" +
                "monthlyPayment=" + monthlyPayment +
                "; name=" + getName() +
                "; id=" + getId() +
                "; averageSalary=" + averageSalary() +
                '}';
    }
}
