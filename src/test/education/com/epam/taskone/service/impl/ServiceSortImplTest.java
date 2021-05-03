package education.com.epam.taskone.service.impl;

import main.education.com.epam.taskone.entity.CustomArray;
import main.education.com.epam.taskone.service.ArraySortsService;
import main.education.com.epam.taskone.service.impl.ServiceSortImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ServiceSortImplTest {
    static Logger logger = LogManager.getLogger();
    private final ArraySortsService service = new ServiceSortImpl();
    CustomArray customArray;

    @BeforeClass
    public void setCustomArray(){
        this.customArray = new CustomArray(new int[]{0, 15, 0, -7, 4, 25, -1, 1});
    }

    @Test
    public void testBubbleSort() {
        int[] actual = this.service.bubbleSort(this.customArray);
        int[] expeceted = {25, 15, 4, 1, 0, 0, -1, -7};
        assertEquals(actual, expeceted);
    }

    @Test
    public void testShakeSort() {
        int[] actual = this.service.shakeSort(this.customArray);
        int[] expected = {25, 15, 4, 1, 0, 0, -1, -7};
        assertEquals(actual, expected);
    }

    @Test
    public void testSelectionSort() {
        int[] actual = this.service.selectionSort(this.customArray);
        int[] expected = {25, 15, 4, 1, 0, 0, -1, -7};
        assertEquals(actual, expected);
    }

    @AfterClass
    public void tierDown(){
        this.customArray = null;
    }
}