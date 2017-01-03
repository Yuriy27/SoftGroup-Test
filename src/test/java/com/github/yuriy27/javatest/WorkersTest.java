package com.github.yuriy27.javatest;

import com.github.yuriy27.javatest.task5.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Юра on 03.01.2017.
 */
public class WorkersTest {

    List<Worker> workerList = new ArrayList<Worker>() {
        {
            add(new HourlyWageWorker(1, "Vasya", 2));
            add(new FixedPaymentWorker(2, "Jenia", 50));
            add(new FixedPaymentWorker(3, "ZZZ", 50));
            add(new HourlyWageWorker(4, "Vasyahhh", 2));
            add(new FixedPaymentWorker(5, "Jeniahhh", 50));
            add(new FixedPaymentWorker(6, "ZZZhhh", 50));
        }
    };

    @Test
    public void testWorkersSort() {
        WorkersRepositoryImpl repository = new WorkersRepositoryImpl(workerList);
        repository.sort();
        repository.print();
    }

    @Test
    public void testWorkersFirstFive() {
        WorkersRepositoryImpl repository = new WorkersRepositoryImpl(workerList);
        repository.firstFiveWorkers();
    }

    @Test
    public void testWorkersThreeLast() {
        WorkersRepositoryImpl repository = new WorkersRepositoryImpl(workerList);
        repository.writeThreeLastId();
    }

    @Test
    public void testWritingToFile() {
        List<Worker> workers = new ArrayList<>();
        workers.add(new HourlyWageWorker(1, "Vasya", 2));
        workers.add(new FixedPaymentWorker(2, "Jenia", 50));
        workers.add(new FixedPaymentWorker(3, "ZZZ", 50));
        WorkersRepositoryImpl repository = new WorkersRepositoryImpl(workers);
        repository.writeToFile("src/main/resources/w.out");
    }

    @Test
    public void testReadingFromFile() {
        WorkersRepositoryImpl repository = new WorkersRepositoryImpl(workerList);
        repository.readFromFile("src/main/resources/w.out");
        repository.print();
    }

}
