package education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.impl.StreamServiceImpl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StreamServiceImplTest {

    private final StreamServiceImpl streamService = new StreamServiceImpl();
    CustomArray customArray;

    @BeforeClass
    public void setCustomArray(){
        this.customArray = new CustomArray(new int[]{0, 15, 0, -7, 4, 25, -1, 1});
    }

    @Test
    public void testFindMinValue() {
        int actual = this.streamService.findMinValue(this.customArray);
        int expected = -7;
        assertEquals(actual, expected);

    }

    @Test
    public void testFindMaxValue() {
        int actual = this.streamService.findMaxValue(this.customArray);
        int expected = 25;
        assertEquals(actual, expected);
    }

    @Test
    public void testChangeOddValuesByZero() {
        int[] actual = this.streamService.changeOddValuesByZero(this.customArray);
        int[] expected = {0, 15, 0, 0, 4, 25, 0, 1};
        assertEquals(actual, expected);
    }

    @Test
    public void testAverageValue() {
        double actualValue = this.streamService.averageValue(this.customArray);
        double expectedValue = 4.625;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testFindSumValues() {
        int actualValue = this.streamService.findSumValues(this.customArray);
        int expectedValue = 37;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testFindNegativeValues() {
        int actualValue = this.streamService.findNegativeValues(this.customArray);
        int expected = 2;
        assertEquals(actualValue, expected);
    }

    @Test
    public void testFindPositiveValues() {
        int actualValue = this.streamService.findPositiveValues(this.customArray);
        int expected = 4;
        assertEquals(actualValue, expected);
    }
    @AfterClass
    public void tierDown(){
        this.customArray = null;
    }
}