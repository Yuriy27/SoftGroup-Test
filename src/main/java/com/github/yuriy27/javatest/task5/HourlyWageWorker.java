package com.github.yuriy27.javatest.task5;

/**
 * Created by Юра on 03.01.2017.
 */
public class HourlyWageWorker extends Worker {

    private double hourlyRate;

    public HourlyWageWorker(long id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double averageSalary() {
        return 20.8 * 8 * hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HourlyWageWorker that = (HourlyWageWorker) o;

        return Double.compare(that.hourlyRate, hourlyRate) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(hourlyRate);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "HourlyWageWorker{" +
                "hourlyRate=" + hourlyRate +
                "; name=" + getName() +
                "; id=" + getId() +
                "; averageSalary=" + averageSalary() +
                '}';
    }
}
