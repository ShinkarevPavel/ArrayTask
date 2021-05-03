package main.education.com.epam.taskone.service;

import main.education.com.epam.taskone.entity.CustomArray;

public interface ArraySortsService {
    int[] bubbleSort(CustomArray customArray);
    int[] shakeSort(CustomArray customArray);
    int[] selectionSort(CustomArray customArray);

}
