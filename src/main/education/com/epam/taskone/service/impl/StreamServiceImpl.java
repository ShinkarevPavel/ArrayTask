package main.education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.ArrayService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;


public class StreamServiceImpl implements ArrayService {

    static final Logger logger = LogManager.getLogger();
    @Override
    public int findMinValue(CustomArray array) {
        int minValue = 0;
        OptionalInt min = IntStream.of(array.getDataArray()).min();
        if (min.isPresent()){
            minValue = min.getAsInt();
            logger.info("Successful. Min value is " + minValue);
        }else {
            logger.info("Issue with finding min value");
        }
        return minValue;
    }

    @Override
    public int findMaxValue(CustomArray array) {
        int maxValue = 0;
        OptionalInt max = IntStream.of(array.getDataArray()).max();
        if (max.isPresent()){
            maxValue = max.getAsInt();
            logger.info("Successful. Max value is " + maxValue);
        } else {
            logger.info("Issue with finding max value");
        }
        return maxValue;
    }

    @Override
    public int[] changeOddValuesByZero(CustomArray array) {
        int[] arrayCopy = IntStream.of(array.getDataArray())
                .map(i -> (i < 0 ? i = 0 : i))
                .toArray();
        logger.info("Successful. Replaced array is " + Arrays.toString(arrayCopy));
        return arrayCopy;
    }

    @Override
    public double averageValue(CustomArray array) {
        double average = 0;
        OptionalDouble optionalDouble = IntStream.of(array.getDataArray())
                .average();
        if (optionalDouble.isPresent()){
            average = optionalDouble.getAsDouble();
            logger.info("Successful. Average value is " + average);
        } else {
            logger.info("Issue with finding average value");
        }
        return average;
    }

    @Override
    public int findSumValues(CustomArray array) {
        int sum = IntStream.of(array.getDataArray())
                .sum();
        logger.info("Successful. Sum value is " + sum);
        return sum;
    }

    @Override
    public int findNegativeValues(CustomArray array) {
        int[] count = IntStream.of(array.getDataArray())
                .filter(value -> value < 0)
                .toArray();
        logger.info("Successful. Number of negative elements values is " + count.length);
        return count.length;
    }

    @Override
    public int findPositiveValues(CustomArray array) {
        int[] count = IntStream.of(array.getDataArray())
                .filter(value -> value > 0)
                .toArray();
        logger.info("Successful. Number of positive elements values is " + count.length);
        return count.length;
    }
}
