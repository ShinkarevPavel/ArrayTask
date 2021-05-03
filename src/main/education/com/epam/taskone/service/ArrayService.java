package main.education.com.epam.taskone.service;

import main.education.com.epam.taskone.entity.CustomArray;

public interface ArrayService {
    int findMinValue(CustomArray array);
    int findMaxValue(CustomArray array);
    int[] changeOddValuesByZero(CustomArray array);
    double averageValue(CustomArray array);
    int findSumValues(CustomArray array);
    int findNegativeValues(CustomArray array);
    int findPositiveValues(CustomArray array);
}
