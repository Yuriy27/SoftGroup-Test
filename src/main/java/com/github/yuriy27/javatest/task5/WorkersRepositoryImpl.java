package com.github.yuriy27.javatest.task5;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Юра on 03.01.2017.
 */
public class WorkersRepositoryImpl implements WorkersRepository {

    private List<Worker> workers;

    @Override
    public void sort() {
        Collections.sort(workers, Collections.reverseOrder(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                if (o1.averageSalary() > o2.averageSalary()) {
                    return 1;
                }
                if (o1.averageSalary() < o2.averageSalary()) {
                    return -1;
                }
                return o1.getName().compareTo(o2.getName());
            }
        }));
    }

    @Override
    public void firstFiveWorkers() {
        for (int i = 0; i < 5; i++) {
            if (i < workers.size()) {
                System.out.println(workers.get(i));
            }
        }
    }

    @Override
    public void writeThreeLastId() {
        for (int i = workers.size() - 3; i < workers.size(); i++) {
            if (i >= 0) {
                System.out.println(workers.get(i).getId());
            }
        }
    }

    @Override
    public void writeToFile(String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))){
            oos.writeObject(workers);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void readFromFile(String path) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            workers = (List<Worker>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        workers.forEach(worker -> System.out.println(worker));
    }

    public WorkersRepositoryImpl(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
