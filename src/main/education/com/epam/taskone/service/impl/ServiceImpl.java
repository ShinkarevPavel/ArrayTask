package main.education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ServiceImpl implements ArrayService {
    static final Logger logger = LogManager.getLogger();

    @Override
    public int findMinValue(CustomArray array) {
        int min = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getDataArray()[i] < min){
                min = array.getDataArray()[i];
            }
        }
        logger.info("Successful. Min value is " + min);
        return min;
    }

    @Override
    public int findMaxValue(CustomArray array) {
        int max = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getDataArray()[i] > max){
                max = array.getDataArray()[i];
            }
        }
        logger.info("Successful. Min value is " + max);
        return max;
    }

    @Override
    public int[] changeOddValuesByZero(CustomArray array) {
        int[] arrayCopy = array.getDataArray();
        for (int i = 0; i < arrayCopy.length; i++) {
            if (arrayCopy[i] < 0){
                arrayCopy[i] = 0;
            }
        }
        logger.info("Successful. New changed array is " + Arrays.toString(arrayCopy));
        return arrayCopy;
    }

    @Override
    public double averageValue(CustomArray array) {
        double average = 0;
//        int average = findSumValues(array);
        for (int i = 0; i < array.length(); i++) {
            average += array.getDataArray()[i];
        }
        average = average / array.length();
        logger.info("Successful. Average value is " + average);
        return average;
    }

    @Override
    public int findSumValues(CustomArray array) {
        int sum = 0;
        for (int i = 0; i < array.length(); i++) {
            sum += array.getDataArray()[i];
        }
        logger.info("Successful. Sum value is " + sum);
        return sum;
    }

    @Override
    public int findNegativeValues(CustomArray array) {
        int counter = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getDataArray()[i] < 0){
                counter++;
            }
        }
        logger.info("Successful. Number of negative elements values is " + counter);
        return counter;
    }

    @Override
    public int findPositiveValues(CustomArray array) {
        int counter = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getDataArray()[i] > 0){
                counter++;
            }
        }
        logger.info("Successful. Number of positive elements values is " + counter);
        return counter;
    }
}
