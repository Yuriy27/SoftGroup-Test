package com.github.yuriy27.javatest.task4;

/**
 * Created by Юра on 03.01.2017.
 */
public class Customer {

    private String name;

    private Rental rental;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rental getRental() {
        return rental;
    }

    public void setRental(Rental rental) {
        this.rental = rental;
    }
}
