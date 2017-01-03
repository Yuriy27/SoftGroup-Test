package com.github.yuriy27.javatest.task5;

import java.io.Serializable;

/**
 * Created by Юра on 03.01.2017.
 */
public abstract class Worker implements Serializable {

    private long id;

    private String name;

    public Worker(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double averageSalary();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
