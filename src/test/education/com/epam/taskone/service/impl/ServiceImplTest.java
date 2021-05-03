package education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.impl.ServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ServiceImplTest {
    static final Logger logger = LogManager.getLogger();
    private final ServiceImpl service = new ServiceImpl();
    CustomArray customArray;

    @BeforeClass
    public void setCustomArray(){
        this.customArray = new CustomArray(new int[]{0, 15, -7, 4, -25});
    }

    @Test
    public void testFindMinValue() {
        int actualValue = this.service.findMinValue(this.customArray);
        int expectedValue = -25;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testFindMaxValue() {
        int actualValue = this.service.findMaxValue(this.customArray);
        int expected = 15;
        assertEquals(actualValue, expected);
    }

    @Test
    public void testСhangeOddValuesByZero() {
        int[] actualValue = this.service.changeOddValuesByZero(this.customArray);
        int[] expectedValue = {0, 15, 0, 4, 0};
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testAverageValue() {
        double actualValue = this.service.averageValue(this.customArray);
        double expectedValue = -2.6;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testFindSumValues() {
        int actualValue = this.service.findSumValues(this.customArray);
        int expectedValue = -13;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testFindNegativeValues() {
        int actualValue = this.service.findNegativeValues(this.customArray);
        int expectedValue = 2;
        assertEquals(actualValue, expectedValue);
    }

    @Test
    public void testFindPositiveValues() {
        int actualValue = this.service.findPositiveValues(this.customArray);
        int expectedValue = 2;
        assertEquals(actualValue, expectedValue);
    }

    @AfterClass
    public void tierDown(){
        this.customArray = null;
    }
}