package main.education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.ArraySortsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ServiceSortImpl implements ArraySortsService {
    static final Logger logger = LogManager.getLogger();

    @Override
    public int[] bubbleSort(CustomArray customArray) {
        int[] array = customArray.getDataArray();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        logger.info("Array was sorted " + Arrays.toString(array));
        return array;
    }

    @Override
    public int[] shakeSort(CustomArray customArray) {
        int[] array = customArray.getDataArray();
        for (int i = 0; i < array.length / 2; i++) {
            boolean isSwap = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwap = true;
                }
            }
            for (int j = array.length - 2 - i; j > i ; j--) {
                if (array[j] > array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap){
                break;
            }
        }
        logger.info("Array was sorted " + Arrays.toString(array));
        return array;
    }

    @Override
    public int[] selectionSort(CustomArray customArray) {
        int[] array = customArray.getDataArray();
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[max]){
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        logger.info("Array was sorted " + Arrays.toString(array));
        return array;
    }
}
