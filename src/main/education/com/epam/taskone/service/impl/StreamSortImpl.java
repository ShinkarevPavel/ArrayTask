package main.education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.ArraySortsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

public class StreamSortImpl {
    static final Logger logger = LogManager.getLogger();

    public int[] bubbleSort(CustomArray customArray) {
        int[] arrayCopy = customArray.getDataArray();
        BiConsumer<int[], Integer> consumer = (array, i) -> {
            if (array[i] < array[i + 1]){
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        };
        IntStream.range(0, arrayCopy.length - 1)
                .forEach(i -> IntStream.range(0, arrayCopy.length - 1)
                .forEach(j -> consumer.accept(arrayCopy, j)));

        logger.info("Array was sorted by IntStream " + Arrays.toString(arrayCopy));
        return arrayCopy;
    }

    public int[] streamSort(CustomArray customArray) {
        int[] copyArray = IntStream.of(customArray.getDataArray()).sorted().toArray();
        logger.info("Array was sorted by sort method from IntStream interface" + Arrays.toString(copyArray));
        return copyArray;
    }

}
