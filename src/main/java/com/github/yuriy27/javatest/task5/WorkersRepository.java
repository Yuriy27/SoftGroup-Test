package com.github.yuriy27.javatest.task5;

import java.io.IOException;

/**
 * interface that operates with collection of workers
 * @author Юра
 * @version 1.0
 */
public interface WorkersRepository {

    /**
     * sort list of workers in descending order
     */
    void sort();

    /**
     * print information about first five workers in our worker list
     */
    void firstFiveWorkers();

    /**
     * print id's of three last workers in collection
     */
    void writeThreeLastId();

    /**
     * write collection of workers to file (serialize our list)
     * @param path name of output file
     */
    void writeToFile(String path);

    /**
     * read collection of workers from file and set that value to workers list
     * @param path name of input file
     */
    void readFromFile(String path);

    /**
     * print information about all workers in collection
     */
    void print();

}
